 package org.usfirst.frc.team1247.robot;

import org.usfirst.frc.team1247.robot.utils.ControllerType;
import org.usfirst.frc.team1247.robot.utils.DriveType;
import org.usfirst.frc.team1247.robot.utils.DriveMode;

import edu.wpi.first.wpilibj.Joystick;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    
	ControllerType controller;
	DriveType driveType;
	public static DriveMode driveMode;
	
	Joystick leftJoystick;
	Joystick rightJoystick; 
	
	Joystick arduino;
	
	Joystick snesJoystick;
	
	Joystick xboxJoystick;
	
	Joystick xboxArmJoystick;
	/**
	 * Initializes both joysticks.
	 */
	
//------------------------------------Controller type---------------------------------------------------------------------------------
	
	
	public OI () {	
		
		controller = ControllerType.XBOX_CONTROLLER;

		switch (controller){
		case XBOX_CONTROLLER:
			xboxJoystick = new Joystick(RobotMap.XBOX_ID);
			break;
		case JOYSTICK:
			leftJoystick = new Joystick(RobotMap.JOYSTICK_LEFT_ID);
			rightJoystick = new Joystick(RobotMap.JOYSTICK_RIGHT_ID);
			break;
		}
	}
	
	
	
//---------------------------------------Axis-----------------------------------------------------------------------------------------
	
	
	
	public double getXAxis() {
		double axisValue = 0;
		
		switch(this.controller){
		case XBOX_CONTROLLER:
			 axisValue = xboxJoystick.getRawAxis(RobotMap.XBOX_XAXIS_ID);
			 break;
		case JOYSTICK:
			axisValue = leftJoystick.getRawAxis(RobotMap.JOYSTICK_XAXIS_ID);
			break;
		default:
			axisValue = 0; //bad stuff happened, let the crying begin
			break;
		}
		return axisValue;
	}
	
	public double getYAxis() {
		double axisValue = 0;
		
		switch(this.controller){
		case XBOX_CONTROLLER:
			 axisValue = xboxJoystick.getRawAxis(RobotMap.XBOX_YAXIS_ID);
			 break;
		case JOYSTICK:
			axisValue = leftJoystick.getRawAxis(RobotMap.JOYSTICK_YAXIS_ID);
			break;
		default:
			axisValue = 0; //bad stuff happened, let the crying begin
			break;
		}
		return axisValue;
	}
	
//------------------------------------------------------------------------------------------------------------------------------------
	
	public double getLeftAxis() {
		double axisValue = 0;
		
		switch(this.controller){
		case XBOX_CONTROLLER:
			 axisValue = xboxJoystick.getRawAxis(RobotMap.XBOX_LEFT_YAXIS_ID);
			 break;
		case JOYSTICK:
			axisValue = leftJoystick.getRawAxis(RobotMap.JOYSTICK_YAXIS_ID);
			break;
		default:
			axisValue = 0; //bad stuff happened, let the crying begin
			break;
		}
		return axisValue;
	}
	
	
//------------------------------------------------------------------------------------------------------------------------------------
	
	
	public double getRightAxis() {
		double axisValue = 0;
		
		switch(this.controller){
		case XBOX_CONTROLLER:
			 axisValue = xboxJoystick.getRawAxis(RobotMap.XBOX_RIGHT_YAXIS_ID);
			 break;
		case JOYSTICK:
			axisValue = rightJoystick.getRawAxis(RobotMap.JOYSTICK_YAXIS_ID);
			break;
		default:
			axisValue = 0; //bad stuff happened, let the crying begin
			break;
		}
		return axisValue;
	}
	
	
//-----------------------------------------------Throttle-----------------------------------------------------------------------------

	
	
	public double getZThrottle() {
		double throttle = 0;
		
		switch(this.controller){
		case JOYSTICK:
			throttle = rightJoystick.getRawAxis(RobotMap.JOYSTICK_XAXIS_ID);
			throttle = -0.60*throttle + 1;
			break;
		default:
			throttle = RobotMap.CONTROLLER_THROTTLE;
			break;
		}
		return throttle;
	}
	
	
	
//-----------------------------------------Pneumatic leg buttons----------------------------------------------------------------------
	
	
//-----------------------------------------Front--------------------------------------------------------------------------------------	

	
	public boolean getFrontLeftPneumaticsButton(){
		boolean pressed = false;
		
		switch(this.controller){
		case XBOX_CONTROLLER:
			pressed = xboxJoystick.getRawButton(RobotMap.XBOX_PNEUMATICS_LEFT_BUTTON_ID);
			break;
		case JOYSTICK:
			pressed = leftJoystick.getRawButton(RobotMap.JOYSTICK_PNEUMATICS_FRONT_LEFT_BUTTON_ID);
			break;
		default:
			pressed = false;
			break;
		}
		return pressed;
	}

	
	
	public boolean getFrontRightPneumaticsButton(){
		boolean pressed = false;
		
		switch(this.controller){
		case XBOX_CONTROLLER:
			pressed = xboxJoystick.getRawButton(RobotMap.XBOX_PNEUMATICS_RIGHT_BUTTON_ID);
			break;
		case JOYSTICK:
			pressed = rightJoystick.getRawButton(RobotMap.JOYSTICK_PNEUMATICS_FRONT_RIGHT_BUTTON_ID);
			break;
		default:
			pressed = false;
			break;
		}
		return pressed;
	}
	
//------------------------------------------Rear-----------------------------------------------------------------------------------------	
	
	
	public boolean getRearLeftPneumaticsButton(){
		boolean pressed = false;
		double triggerValue = 0;
		
		switch(this.controller){
		case XBOX_CONTROLLER:
			triggerValue = xboxJoystick.getRawAxis(RobotMap.XBOX_PNEUMATICS_LTRIGGER_ID);
			if (triggerValue > 0){
				pressed = true;
			}
			break;
		case JOYSTICK:
			pressed = leftJoystick.getRawButton(RobotMap.JOYSTICK_PNEUMATICS_REAR_LEFT_BUTTON_ID);
			break;
		default:
			pressed = false;
			break;
		}
		return pressed;
	}
	
	
	
	
	public boolean getRearRightPneumaticsButton(){
		boolean pressed = false;
		double triggerValue = 0;
		
		switch(this.controller){
		case XBOX_CONTROLLER:
			triggerValue = xboxJoystick.getRawAxis(RobotMap.XBOX_PNEUMATICS_RTRIGGER_ID);
			if (triggerValue > 0){
				pressed = true;
			}
			break;
		case JOYSTICK:
			pressed = rightJoystick.getRawButton(RobotMap.JOYSTICK_PNEUMATICS_REAR_RIGHT_BUTTON_ID);
		default:
			pressed = false;
			break;
		}
		return pressed;
	}
	
	
	
//---------------------------------------------------Leg Toggle Button---------------------------------------------------------------
	
	
	public boolean getLegToggleButton(){
		boolean pressed = false;
		driveType = DriveType.DRIVETRAIN;
		
		switch(this.controller){
		case XBOX_CONTROLLER:
			pressed = xboxJoystick.getRawButton(RobotMap.XBOX_LEG_TOGGLE_BUTTON_ID);
			if (pressed){
				switch(driveType){
				case DRIVETRAIN:
					this.driveType = DriveType.LEGSDRIVE;
					break;
				default:
					this.driveType = DriveType.DRIVETRAIN;
					break;
				}
			}
			break;
		case JOYSTICK:
			pressed = rightJoystick.getRawButton(RobotMap.JOYSTICK_LEG_TOGGLE_BUTTON_ID);
			if (pressed){
				switch(driveType){
				case DRIVETRAIN:
					this.driveType = DriveType.LEGSDRIVE;
					break;
				default:
					this.driveType = DriveType.DRIVETRAIN;
					break;
				}
			}
			break;
		}
		return pressed;
	}
	
	
//---------------------------------------------------------Suction--------------------------------------------------------------------
		
	
	public boolean getSuctionButton(){
		boolean pressed = false;
		
		switch(this.controller){
		case XBOX_CONTROLLER:
			pressed = xboxJoystick.getRawButton(RobotMap.XBOX_SUCTION_BUTTON_ID);
			break;
		case JOYSTICK:
			pressed = rightJoystick.getRawButton(RobotMap.JOYSTICK_SUCTION_BUTTON_ID);
			break;
		}
		return pressed;
	}
	
	
	
	public boolean getReverseSuctionButton(){
		boolean pressed = false;
		
		switch(this.controller){
		case XBOX_CONTROLLER:
			pressed = xboxJoystick.getRawButton(RobotMap.XBOX_REVERSE_SUCTION_BUTTON_ID);
			break;
		case JOYSTICK:
			pressed = rightJoystick.getRawButton(RobotMap.JOYSTICK_REVERSE_SUCTION_BUTTON_ID);
			break;
		}
		return pressed;
	}
	
//---------------------------------------------Drive Mode----------------------------------------------------------------------------

	public void setDriveMode() {
		
		if (arduino.getRawButton(RobotMap.ARDUINO_DRIVE_MODE_BUTTON)){
			this.driveMode = DriveMode.ARCADE_DRIVE;
		} else {
			this.driveMode = DriveMode.TANK_DRIVE;
				
		}
	}
	
//-------------------------------------------Controller Type-------------------------------------------------------------------------
	
	public void setControllerType() {
		
		if (arduino.getRawButton(RobotMap.ARDUINO_CONTROLLER_BUTTON)) {
			this.controller = ControllerType.XBOX_CONTROLLER;
		} else {
			this.controller = ControllerType.JOYSTICK;
		}
				
	}
	
}
	

//---------------------------------------------Obsolete Lift--------------------------------------------------------------------------


/*public boolean getLiftButton() {
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
}*/

	/*public boolean getXboxLiftButton () {
		return xboxJoystick.getRawButton(RobotMap.XBOX_LIFT_BUTTON_ID);
	}
	
	public boolean getXboxReverseLiftButton () {
		return xboxJoystick.getRawButton(RobotMap.XBOX_REVERSE_BUTTON_ID);
	}
	
	public boolean getXboxToteButton(){ 
		return xboxJoystick.getRawButton(RobotMap.JOYSTICK_TOTE_UP_BUTTON_ID);
	}
	
	public boolean getXboxToteButtonDown(){
		return xboxJoystick.getRawButton(RobotMap.XBOX_TOTE_DOWN_BUTTON_ID);
	}
	
	public boolean getXboxCanButton () {
		return xboxJoystick.getRawButton(RobotMap.XBOX_CAN_UP_BUTTON_ID);
	}
	
	public boolean getXboxCanButtonDown () {
		return xboxJoystick.getRawButton(RobotMap.XBOX_CAN_DOWN_BUTON_ID);
	}
	
	public boolean getSnesLiftButton () {
		return snesJoystick.getRawButton(RobotMap.SNES_LIFT_BUTTON_ID);
	}
	
	public boolean getSnesReverseLiftButton () {
		return snesJoystick.getRawButton(RobotMap.SNES_REVERSE_LIFT_BUTTON_ID);
	}
	
	public boolean getSnesToteButton () {
		return snesJoystick.getRawButton(RobotMap.SNES_TOTE_UP_BUTTON_ID);
	}
	
	public boolean getSnesToteButtonDown () {
		return snesJoystick.getRawButton(RobotMap.SNES_TOTE_DOWN_BUTTON_ID);
	}
	
	public boolean getSnesCanButton () {
		return snesJoystick.getRawButton(RobotMap.SNES_CAN_UP_BUTTON_ID);
	}
	
	public boolean getSnesCanButtonDown () {
		return snesJoystick.getRawButton(RobotMap.SNES_CAN_DOWN_BUTTON_ID);
	}
}*/
