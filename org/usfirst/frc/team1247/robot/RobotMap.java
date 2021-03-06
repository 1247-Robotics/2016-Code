package org.usfirst.frc.team1247.robot;

/**
 * The RobotMap is a mapping from the ports, sensors and actuators are wired
 * into to a variable name. This provides flexibility changing wiring, makes
 * checking the wiring easier and significantly reduces the number of magic
 * numbers floating around.
 */
public class RobotMap {
	// Magic numbers go here!
	public static final int ARDUINO_ID = 3;
	public static final int SNES_ID = 0;
	public static final int XBOX_DRIVE_ID = 1;
	public static final int XBOX_ARM_ID = 4;
	public static final int JOYSTICK_LEFT_ID = 1;
	public static final int JOYSTICK_RIGHT_ID = 0;

	public static final double CONTROLLER_THROTTLE = 1; // limits absolute speed
														// when xbox or snes
														// controller
	public static final int DIGITAL_INPUT_SUCTION_ID = 0;
	// -------------------------------------------Joysticks---------------------------------------------------------------------------

	// Lift Buttons and Stuff
	public static final int JOYSTICK_XAXIS_ID = 0;
	public static final int JOYSTICK_YAXIS_ID = 1;
	// Joystick Pneumatic leg buttons
	public static final int JOYSTICK_PNEUMATICS_FRONT_BUTTON_ID = 3;
	public static final int JOYSTICK_PNEUMATICS_REAR_RIGHT_BUTTON_ID = 2;
	public static final int JOYSTICK_PNEUMATICS_REAR_LEFT_BUTTON_ID = 2;

	// Leg toggle
	//public static final int JOYSTICK_LEG_TOGGLE_BUTTON_ID = 1;

	// Suction for boulder
	public static final int JOYSTICK_SUCTION_BUTTON_ID = 10;
	public static final int JOYSTICK_REVERSE_SUCTION_BUTTON_ID = 1;

	// -----------------------------------------------Xbox-------------------------------------------------------------------------------

	// Drive
	public static final int XBOX_LEFT_YAXIS_ID = 1;
	public static final int XBOX_RIGHT_YAXIS_ID = 5;
	public static final int XBOX_RIGHT_XAXIS_ID = 4;
	public static final int XBOX_XAXIS_ID = 0;
	public static final int XBOX_YAXIS_ID = 1;

	// Pneumatic legs
	public static final int XBOX_PNEUMATICS_RTRIGGER_ID = 3;
	public static final int XBOX_PNEUMATICS_LTRIGGER_ID = 2;
	public static final int XBOX_PNEUMATICS_FRONT_BUTTON_ID = 1;
	public static final int XBOX_PNEUMATICS_RIGHT_REAR_BUTTON_ID = 6;
	public static final int XBOX_PNEUMATICS_LEFT_REAR_BUTTON_ID = 5;

	// Leg toggle
	public static final int XBOX_LEG_TOGGLE_BUTTON_ID = 1;


	// Suction for boulder
	public static final int XBOX_SUCTION_BUTTON_ID = 3;
	public static final int XBOX_REVERSE_SUCTION_BUTTON_ID = 4;

	// -------------------------------------------------SNES----------------------------------------------------------------------------

	// SNES controller
	// Drive
	public static final int SNES_LEFT_YAXIS_ID = 1;
	public static final int SNES_X_BUTTON_ID = 3;
	public static final int SNES_Y_BUTTON_ID = 2;

	// -------------------------------------------------ARDUINO--------------------------------------------------------------------------

	public static final int ARDUINO_ROUGH_TERRAIN_BUTTON = 4;
	public static final int ARDUINO_ROCK_WALL_BUTTON = 5;
	public static final int ARDUINO_MOAT_BUTTON = 6;
	public static final int ARDUINO_RAMPARTS_BUTTON = 7;

	// ----------------------------------------------------------------------------------------------------------------------------------

	// Talons
	public static final int TALON_CHANNEL_LEFT = 1; //1
	public static final int TALON_CHANNEL_RIGHT = 0; //0
	public static final int LEG_TALON_CHANNEL_RIGHT = 4; //5
	public static final int LEG_TALON_CHANNEL_LEFT = 5; //4
	public static final int TALON_CHANNEL_ARM_Y = 6;
	public static final int TALON_CHANNEL_ARM_X = 7;
	//public static final int TALON_CHANNEL_LIFT = 2;
	public static final int TALON_CHANNEL_SUCTION_LEFT = 2;
	public static final int TALON_CHANNEL_SUCTION_RIGHT = 3;

	public static final double SUCTION_SPEED = .25; // max is 1
	public static final double BLOW_SPEED = -1; // max is -1
	public static final double SUCTION_STOP = 0;
	
	public static final double LEG_SPEED_MULTIPLIER = 0.65; 
	public static final double ARM_SPEED_MULTIPLIER = 0.6;

	// ----------------------------------------------------------------------------------------------------------------------------------

	// Pneumatics
	public static final int COMPRESSOR_CHANNEL = 0;
	public static final int FRONT_LEG_SOLENOID_CHANNEL = 1;
	public static final int REAR_RIGHT_LEG_SOLENOID_CHANNEL = 0;
	public static final int REAR_LEFT_LEG_SOLENOID_CHANNEL = 2;
	public static final int FRONT_RIGHT_LEG = 1;
	public static final int FRONT_LEFT_LEG = 2;
	public static final int REAR_RIGHT_LEG = 3;
	public static final int REAR_LEFT_LEG = 4;

	// ----------------------------------------------------------------------------------------------------------------------------------

}