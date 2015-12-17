package org.usfirst.frc.team1247.robot;

import edu.wpi.first.wpilibj.Joystick;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    
	Joystick leftJoystick;
	Joystick rightJoystick;
	
	/**
	 * Initializes both joysticks.
	 */
	public OI () {
		leftJoystick = new Joystick(RobotMap.JOYSTICK_LEFT_ID);
		rightJoystick = new Joystick(RobotMap.JOYSTICK_RIGHT_ID);
	}
	
	public double getLeftAxis() {
		return leftJoystick.getRawAxis(RobotMap.JOYSTICK_YAXIS_ID);
	}
	
	public double getRightAxis() {
		return rightJoystick.getRawAxis(RobotMap.JOYSTICK_YAXIS_ID);
	}
	
	public boolean getLiftButton() {
		return rightJoystick.getRawButton(RobotMap.JOYSTICK_LIFT_BUTTON_ID);
	}
	
	public boolean getReverseLiftButton() {
		return leftJoystick.getRawButton(RobotMap.JOYSTICK_REVERSE_LIFT_BUTTON_ID);
	}
	
	public boolean getToteButton() {
		return rightJoystick.getRawButton(RobotMap.JOYSTICK_TOTE_UP_BUTTON_ID);
	}
	
	public boolean getCanButton() {
		return leftJoystick.getRawButton(RobotMap.JOYSTICK_CAN_UP_BUTTON_ID);
	}
	
	public boolean getToteButtonDown() {
		return rightJoystick.getRawButton(RobotMap.JOYSTICK_TOTE_DOWN_BUTTON_ID);
	}
	
	public boolean getCanButtonDown() {
		return leftJoystick.getRawButton(RobotMap.JOYSTICK_CAN_DOWN_BUTTON_ID);
	}
	
	public double getZThrottle() {
		return rightJoystick.getRawAxis(RobotMap.JOYSTICK_XAXIS_ID);			
	}
}

