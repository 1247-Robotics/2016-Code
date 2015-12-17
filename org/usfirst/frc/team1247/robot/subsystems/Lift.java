package org.usfirst.frc.team1247.robot.subsystems;

import org.usfirst.frc.team1247.robot.RobotMap;
import org.usfirst.frc.team1247.robot.commands.LiftCommand;
import org.usfirst.frc.team1247.robot.utils.LiftingState;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The <code>Lift</code> class extends <code>PIDSubsystem</code> and contains methods for controlling the lift subsystem.
 * @author Zander Blasingame
 * @version v4.2.1
 * @see PIDSubsystem
 */
public class Lift extends PIDSubsystem{
	
	private Talon liftTalon;
	
	private DigitalInput bottomSwitch, topSwitch;
		
	private Encoder encoder;
	
	private boolean liftToteUp, liftToteDown;
	private boolean liftCanUp, liftCanDown;
	private boolean canSetEnc;
	private boolean isLifting;
	
	private enum HeightAdjust {NONE, UP, DOWN};
	private HeightAdjust automaticHeightAdjust;
	
	private double desiredDeltaX;
		
	private double deltaX, x_0;
	
	private final int DIAMETER_OF_GEAR = 2; //inches
	
	public Lift() {
		super("Lift", RobotMap.PROPORTIONAL_GAIN, RobotMap.INTEGRAL_GAIN, RobotMap.DERIVATIVE_GAIN);
		
		liftTalon = new Talon(RobotMap.TALON_CHANNEL_LIFT);
		
		topSwitch = new DigitalInput(RobotMap.DIGITAL_INPUT_TOP_ID);
		bottomSwitch = new DigitalInput(RobotMap.DIGITAL_INPUT_BOTTOM_ID);
				
		liftToteDown = liftToteUp = liftCanDown = liftCanUp = isLifting = false;
		automaticHeightAdjust = HeightAdjust.NONE;
		canSetEnc = true;
		
		desiredDeltaX = 0;
		
		encoder = new Encoder(RobotMap.ENCODER_CHANNEL_LIFT_A, RobotMap.ENCODER_CHANNEL_LIFT_B);
		encoder.setDistancePerPulse(DIAMETER_OF_GEAR * Math.PI/130);
		setOutputRange(-1, 1);
		enable();
		
		x_0 = deltaX = encoder.getDistance();
		
		//for test
		LiveWindow.addActuator("lift", "liftTalon", liftTalon);
		LiveWindow.addActuator("lift", "PID", super.getPIDController());
		LiveWindow.addSensor("lift", "ENC", encoder);
		
	}

	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new LiftCommand());
	}
	
	@Deprecated
	/**
	 * Updates the actions of the PID control loop based on the booleans for input.
	 * @param upButton
	 * @param downButton
	 * @param toteUp
	 * @param canUp
	 * @param toteDown
	 * @param canDown
	 */
	public void lift(boolean upButton, boolean downButton, boolean toteUp, boolean canUp, boolean toteDown, boolean canDown) {
		if (toteUp) {
			liftToteUp = true;
			liftToteDown = false;
		}else if (toteDown) {
			liftToteDown = true;
			liftToteUp = false;
		}
		
		if (canUp) {
			liftCanUp = true;
			liftCanDown = false;
		}else if (canDown) {
			liftCanDown = true;
			liftCanUp = false;
		}
		
		if (!(liftToteUp||liftToteDown||liftCanDown||liftCanUp)) x_0 = encoder.getDistance();
		
		deltaX = encoder.getDistance() - x_0;
		
		if (upButton && !topSwitch.get()) {
			increase(6);
		}else if (downButton && !bottomSwitch.get()) {
			increase(-4);
		}else if (!topSwitch.get() && (liftToteUp || liftCanUp)) {
			if (liftToteUp && deltaX < RobotMap.TOTE_HEIGHT) increase(6);
			else if (liftCanUp && deltaX < RobotMap.CAN_HEIGHT) increase(6);
			else liftToteUp = liftCanUp = false;
		}else if (!bottomSwitch.get() && (liftToteDown || liftCanDown)) {
			if (liftToteDown && deltaX > -RobotMap.TOTE_HEIGHT) increase(-4);
			else if (liftCanDown && deltaX > -RobotMap.CAN_HEIGHT) increase(-4);
			else liftToteDown = liftCanDown = false;
		}else {
			increase(0);
		}
			
	}
	
	/**
	 * Updates the actions of the PID control loop based on the booleans for input.
	 * @param liftingState
	 */
	public void lift(LiftingState liftingState) {
		switch(liftingState) {
		case CAN_DOWN:
			desiredDeltaX = -RobotMap.CAN_HEIGHT;
			automaticHeightAdjust = HeightAdjust.DOWN;
			break;
		case CAN_UP:
			desiredDeltaX = RobotMap.CAN_HEIGHT;
			automaticHeightAdjust = HeightAdjust.UP;
			break;
		case MANUAL_DOWN:
			x_0 = encoder.getDistance();
			if (!bottomSwitch.get()) increase(liftingState.getDeltaX());
			automaticHeightAdjust = HeightAdjust.NONE;
			break;
		case MANUAL_UP:
			x_0 = encoder.getDistance();
			if (!topSwitch.get()) increase(liftingState.getDeltaX());
			automaticHeightAdjust = HeightAdjust.NONE;
			break;
		case NONE:
			x_0 = encoder.getDistance();
			automaticHeightAdjust = HeightAdjust.NONE;
			increase(liftingState.getDeltaX());
			break;
		case TOTE_DOWN:
			desiredDeltaX = -RobotMap.TOTE_HEIGHT;
			automaticHeightAdjust = HeightAdjust.DOWN;
			break;
		case TOTE_UP:
			desiredDeltaX = RobotMap.TOTE_HEIGHT;
			automaticHeightAdjust = HeightAdjust.UP;
			break;
		default:
			break;
		}
		
		//debugs switches
		
		//System.out.println("Top: "+topSwitch.get() +" Bottom: "+bottomSwitch.get());
				
		if (topSwitch.get() || bottomSwitch.get()) isLifting = false;
		
		if (automaticHeightAdjust == HeightAdjust.UP || automaticHeightAdjust == HeightAdjust.DOWN) {
			automaticAdjustment(liftingState);
		}else {
			x_0 = encoder.getDistance(); //sets x_0 if not using auto lift.
		}
		
	}
	
	/**
	 * Automatically adjust the height.
	 */
	private void automaticAdjustment(LiftingState liftingState) {
		deltaX = encoder.getDistance() - x_0; //grabs change in x.
		
		switch(automaticHeightAdjust) {
		case DOWN:
			if (!bottomSwitch.get() && deltaX > desiredDeltaX) increase(liftingState.getDeltaX()); 
			else isLifting = false;
			break;
		case UP:
			if (!topSwitch.get() && deltaX < desiredDeltaX) increase(liftingState.getDeltaX());
			else isLifting = false;
			break;
		default:
			break;
		}
	}
	
	/**
	 * Increases the setPoint of the PID Controller by <code>dx</code>
	 * @param dx
	 */
	private void increase(float dx) {
		isLifting = false; //checks if lift is lifting.
				
		if (dx == 0) {
			canSetEnc = false;
		}else {
			canSetEnc = true;
			isLifting = true;
		}
				
		if (canSetEnc) {
			setSetpoint(encoder.getDistance() + dx);
		}
		
	}

	/**
	 * @return the isLifting
	 */
	public boolean isLifting() {
		return isLifting;
	}


	@Override
	protected double returnPIDInput() {
		return encoder.getDistance();
	}

	@Override
	protected void usePIDOutput(double output) {
		liftTalon.set(output);
	}

}
