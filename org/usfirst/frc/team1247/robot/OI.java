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
	
	Joystick snesJoystick;
	
	Joystick xboxJoystick;
	
	Joystick xboxArmJoystick;
	/**
	 * Initializes both joysticks.
	 */
	
//------------------------------------Controller type---------------------------------------------------------------------------------
	
	
	
	public OI () {
		
		if (RobotMap.DRIVE_CONTROL == RobotMap.JOYSTICK){
			
			leftJoystick = new Joystick(RobotMap.JOYSTICK_LEFT_ID);
	
			rightJoystick = new Joystick(RobotMap.JOYSTICK_RIGHT_ID);
			
		} else if (RobotMap.DRIVE_CONTROL == RobotMap.XBOX_CONTROLLER){
			
			xboxJoystick = new Joystick(RobotMap.XBOX_ID);
			
		} else {
			
			snesJoystick = new Joystick(RobotMap.SNES_ID);
		}
	}
	
	
	
//---------------------------------------Axis-----------------------------------------------------------------------------------------
	
	
	
	public double getXAxis() {
		
		if (RobotMap.DRIVE_CONTROL == RobotMap.JOYSTICK) {
		
			return leftJoystick.getRawAxis(RobotMap.JOYSTICK_XAXIS_ID);
		
		} else {
			
			return xboxJoystick.getRawAxis(RobotMap.XBOX_XAXIS_ID);
		}
	}
	
	public double getYAxis() {
		
		if (RobotMap.DRIVE_CONTROL == RobotMap.JOYSTICK) {
		
			return leftJoystick.getRawAxis(RobotMap.JOYSTICK_YAXIS_ID);
		
		} else {
			
			return xboxJoystick.getRawAxis(RobotMap.XBOX_YAXIS_ID);
		}
	}
	
//------------------------------------------------------------------------------------------------------------------------------------
	
	public double getLeftAxis() {
		
		if (RobotMap.DRIVE_CONTROL == RobotMap.JOYSTICK){
		
			return leftJoystick.getRawAxis(RobotMap.JOYSTICK_YAXIS_ID);
			
		} else if (RobotMap.DRIVE_CONTROL == RobotMap.XBOX_CONTROLLER){
			
			return xboxJoystick.getRawAxis(RobotMap.XBOX_LEFT_YAXIS_ID);
			
		} else { 
			
			return snesJoystick.getRawAxis(RobotMap.SNES_LEFT_YAXIS_ID);
		}
	}
	
	
//------------------------------------------------------------------------------------------------------------------------------------
	
	
	public double getRightAxis() {
		
		if (RobotMap.DRIVE_CONTROL == RobotMap.JOYSTICK){
		
			return rightJoystick.getRawAxis(RobotMap.JOYSTICK_YAXIS_ID);
			
		} else if (RobotMap.DRIVE_CONTROL == RobotMap.XBOX_CONTROLLER){
		
			return xboxJoystick.getRawAxis(RobotMap.XBOX_RIGHT_YAXIS_ID);
			
		} else { 
			
			double axisValue;
		
			if (snesJoystick.getRawButton(RobotMap.SNES_X_BUTTON_ID)){
			
				axisValue = 1;
				
			} else if (snesJoystick.getRawButton(RobotMap.SNES_Y_BUTTON_ID)){
			
				axisValue = -1;
				
			} else {
			
				axisValue = 0;
			}
			
			return axisValue;
		}
	}
	
	
//-----------------------------------------------Throttle-----------------------------------------------------------------------------

	
	
	public double getZThrottle() {
		
		double throttle;
		
		if (RobotMap.DRIVE_CONTROL == RobotMap.JOYSTICK){
			
			throttle = rightJoystick.getRawAxis(RobotMap.JOYSTICK_XAXIS_ID);
			
			throttle = -0.60*throttle + 1;
			
		} else {
		
			throttle = RobotMap.CONTROLLER_THROTTLE;
		}
	
		return throttle;			
	}
	
	
	
//-----------------------------------------Pneumatic leg buttons----------------------------------------------------------------------
	
	
//-----------------------------------------Front--------------------------------------------------------------------------------------	

	
	public boolean getFrontLeftPneumaticsButton(){
		
		boolean pressed = false;
		
		if (RobotMap.DRIVE_CONTROL == RobotMap.XBOX_CONTROLLER){
		
			pressed = xboxJoystick.getRawButton(RobotMap.XBOX_PNEUMATICS_LEFT_BUTTON_ID);
		
		} else {
		
			pressed = leftJoystick.getRawButton(RobotMap.JOYSTICK_PNEUMATICS_FRONT_LEFT_BUTTON_ID);
		}
		
		return pressed;
	}

	
	
	public boolean getFrontRightPneumaticsButton(){
		
		boolean pressed = false;
		
		if (RobotMap.DRIVE_CONTROL == RobotMap.XBOX_CONTROLLER){
		
			pressed = xboxJoystick.getRawButton(RobotMap.XBOX_PNEUMATICS_RIGHT_BUTTON_ID);
		
		} else {
		
			pressed = rightJoystick.getRawButton(RobotMap.JOYSTICK_PNEUMATICS_FRONT_RIGHT_BUTTON_ID);
		}
	
		return pressed;
	}
	
//------------------------------------------Rear-----------------------------------------------------------------------------------------	
	
	
	public boolean getRearLeftPneumaticsButton(){
		
		boolean pressed = false;
		
		double triggerValue = 0;
		
		if (RobotMap.DRIVE_CONTROL == RobotMap.XBOX_CONTROLLER){
		
			triggerValue = xboxJoystick.getRawAxis(RobotMap.XBOX_PNEUMATICS_LTRIGGER_ID);
		
		if (triggerValue > 0){
			
			pressed = true;
			}	
		
		} else {
		
			pressed = leftJoystick.getRawButton(RobotMap.JOYSTICK_PNEUMATICS_REAR_LEFT_BUTTON_ID);
		}
		
		return pressed;
		}
	
	
	
	
	public boolean getRearRightPneumaticsButton(){
		
		boolean pressed = false;
		
		if (RobotMap.DRIVE_CONTROL == RobotMap.XBOX_CONTROLLER){
		
			pressed = xboxJoystick.getRawButton(RobotMap.XBOX_PNEUMATICS_RTRIGGER_ID);
		
		} else {
		
			pressed = rightJoystick.getRawButton(RobotMap.JOYSTICK_PNEUMATICS_REAR_RIGHT_BUTTON_ID);
		}
		
		return pressed;
		}
	
	
	
//---------------------------------------------------Leg Toggle Button---------------------------------------------------------------
	
	
	public void getLegToggleButton(){
		
		boolean pressed = false;
		
		if (RobotMap.DRIVE_CONTROL == RobotMap.XBOX_CONTROLLER){
		
			pressed = xboxJoystick.getRawButton(RobotMap.XBOX_LEG_TOGGLE_BUTTON_ID);
			
			if (pressed){
				
				if (RobotMap.DRIVETYPE == RobotMap.DRIVETRAIN){
			
					RobotMap.DRIVETYPE = RobotMap.LEGSDRIVE;
				
				} else {
				
					RobotMap.DRIVETYPE = RobotMap.DRIVETRAIN;
				}
			}
		} else {
		
			pressed = rightJoystick.getRawButton(RobotMap.JOYSTICK_LEG_TOGGLE_BUTTON_ID);
		
			if (pressed){
			
				if (RobotMap.DRIVETYPE == RobotMap.DRIVETRAIN){
			
					RobotMap.DRIVETYPE = RobotMap.LEGSDRIVE;
				
				} else {
				
					RobotMap.DRIVETYPE = RobotMap.DRIVETRAIN;
				}
			}
		}
	}
	
	
//---------------------------------------------------------Suction--------------------------------------------------------------------
		
	
	public boolean getSuctionButton(){
		
		boolean pressed = false;
		
		if (RobotMap.DRIVE_CONTROL == RobotMap.XBOX_CONTROLLER){
			
			pressed = xboxJoystick.getRawButton(RobotMap.XBOX_SUCTION_BUTTON_ID);
		
		} else {
			
			pressed = rightJoystick.getRawButton(RobotMap.JOYSTICK_SUCTION_BUTTON_ID);	
		}
		
		return pressed;
	}
	
	
	
	public boolean getReverseSuctionButton(){
		
		boolean pressed = false;
		
		if (RobotMap.DRIVE_CONTROL == RobotMap.XBOX_CONTROLLER){
		
			pressed = xboxJoystick.getRawButton(RobotMap.XBOX_REVERSE_SUCTION_BUTTON_ID);
		
		} else {
		
			pressed = rightJoystick.getRawButton(RobotMap.JOYSTICK_SUCTION_BUTTON_ID);
		}
		return pressed;
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
