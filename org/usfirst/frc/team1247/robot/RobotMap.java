package org.usfirst.frc.team1247.robot;

/**
 * The RobotMap is a mapping from the ports, sensors and actuators are wired
 * into to a variable name. This provides flexibility changing wiring, makes
 * checking the wiring easier and significantly reduces the number of magic
 * numbers floating around.
 */
public class RobotMap {
	// Magic numbers go here!
	public static final int ARDUINO = 0;
	public static final int SNES_ID = 0;
	public static final int XBOX_ID = 0;
	public static final int JOYSTICK_LEFT_ID = 1;
	public static final int JOYSTICK_RIGHT_ID = 0;
	public static final int JOYSTICK_YAXIS_ID = 1;
	public static final double CONTROLLER_THROTTLE = 1; // limits absolute speed
														// when xbox or snes
														// controller

	// -------------------------------------------Joysticks---------------------------------------------------------------------------

	// Lift Buttons and Stuff
	public static final int JOYSTICK_XAXIS_ID = 0;

	// Joystick Pneumatic leg buttons
	public static final int JOYSTICK_PNEUMATICS_FRONT_RIGHT_BUTTON_ID = 5;
	public static final int JOYSTICK_PNEUMATICS_FRONT_LEFT_BUTTON_ID = 4;
	public static final int JOYSTICK_PNEUMATICS_REAR_RIGHT_BUTTON_ID = 2;
	public static final int JOYSTICK_PNEUMATICS_REAR_LEFT_BUTTON_ID = 2;

	// Leg toggle
	public static final int JOYSTICK_LEG_TOGGLE_BUTTON_ID = 1;

	// Obsolete lift
	public static final int JOYSTICK_LIFT_BUTTON_ID = 1;
	public static final int JOYSTICK_REVERSE_LIFT_BUTTON_ID = 1;
	public static final int JOYSTICK_TOTE_UP_BUTTON_ID = 3;
	public static final int JOYSTICK_TOTE_DOWN_BUTTON_ID = 2;
	public static final int JOYSTICK_CAN_UP_BUTTON_ID = 3;
	public static final int JOYSTICK_CAN_DOWN_BUTTON_ID = 2;
	public static final int JOYSTICK_REVERSE_BUTTON_ID = 4;

	// Suction for boulder
	public static final int JOYSTICK_SUCTION_BUTTON_ID = 10;
	public static final int JOYSTICK_REVERSE_SUCTION_BUTTON_ID = 11;

	// -----------------------------------------------Xbox-------------------------------------------------------------------------------

	// Drive
	public static final int XBOX_LEFT_YAXIS_ID = 1;
	public static final int XBOX_RIGHT_YAXIS_ID = 5;
	public static final int XBOX_XAXIS_ID = 0;
	public static final int XBOX_YAXIS_ID = 1;

	// Pneumatic legs
	public static final int XBOX_PNEUMATICS_RTRIGGER_ID = 3;
	public static final int XBOX_PNEUMATICS_LTRIGGER_ID = 2;
	public static final int XBOX_PNEUMATICS_RIGHT_BUTTON_ID = 6;
	public static final int XBOX_PNEUMATICS_LEFT_BUTTON_ID = 5;

	// Leg toggle
	public static final int XBOX_LEG_TOGGLE_BUTTON_ID = 1;

	// Obsolete Lift
	public static final int XBOX_LIFT_BUTTON_ID = 9;
	public static final int XBOX_REVERSE_LIFT_BUTTON_ID = 10;
	public static final int XBOX_TOTE_DOWN_BUTTON_ID = 2;
	public static final int XBOX_CAN_UP_BUTTON_ID = 0;
	public static final int XBOX_CAN_DOWN_BUTON_ID = 0;
	public static final int XBOX_REVERSE_BUTTON_ID = 8;

	// Suction for boulder
	public static final int XBOX_SUCTION_BUTTON_ID = 3;
	public static final int XBOX_REVERSE_SUCTION_BUTTON_ID = 4;

	// -------------------------------------------------SNES----------------------------------------------------------------------------

	// SNES controller
	// Drive
	public static final int SNES_LEFT_YAXIS_ID = 1;
	public static final int SNES_X_BUTTON_ID = 3;
	public static final int SNES_Y_BUTTON_ID = 2;

	// Obsolete lift
	public static final int SNES_LIFT_BUTTON_ID = 6;
	public static final int SNES_REVERSE_LIFT_BUTTON_ID = 5;
	public static final int SNES_TOTE_UP_BUTTON_ID = 1;
	public static final int SNES_TOTE_DOWN_BUTTON_ID = 4;
	public static final int SNES_CAN_UP_BUTTON_ID = 8;

	// -------------------------------------------------ARDUINO--------------------------------------------------------------------------

	public static final int ARDUINO_DRIVE_MODE_BUTTON = 1;
	public static final int ARDUINO_CONTROLLER_BUTTON = 2;

	// ----------------------------------------------------------------------------------------------------------------------------------

	// Talons
	public static final int TALON_CHANNEL_LEFT = 0;
	public static final int TALON_CHANNEL_RIGHT = 1;
	public static final int LEG_TALON_CHANNEL_RIGHT = 3;
	public static final int LEG_TALON_CHANNEL_LEFT = 4;
	public static final int TALON_CHANNEL_LIFT = 2;
	public static final int TALON_CHANNEL_SUCTION = 5;

	public static final double SUCTION_SPEED = 1; // max is 1
	public static final double BLOW_SPEED = -1; // max is -1
	public static final double SUCTION_STOP = 0;

	public static final int ENCODER_CHANNEL_LIFT_A = 8;
	public static final int ENCODER_CHANNEL_LIFT_B = 9;

	// ----------------------------------------------------------------------------------------------------------------------------------

	// Pneumatics
	public static final int COMPRESSOR_CHANNEL = 0;
	public static final int FRONT_RIGHT_LEG_SOLENOID_CHANNEL = 1;
	public static final int FRONT_LEFT_LEG_SOLENOID_CHANNEL = 3;
	public static final int REAR_RIGHT_LEG_SOLENOID_CHANNEL = 0;
	public static final int REAR_LEFT_LEG_SOLENOID_CHANNEL = 2;
	public static final int FRONT_RIGHT_LEG = 1;
	public static final int FRONT_LEFT_LEG = 2;
	public static final int REAR_RIGHT_LEG = 3;
	public static final int REAR_LEFT_LEG = 4;

	// ----------------------------------------------------------------------------------------------------------------------------------

	// for PID controller.
	public static final float PROPORTIONAL_GAIN = 0.55f;
	public static final float INTEGRAL_GAIN = 0.35f;
	public static final float DERIVATIVE_GAIN = 0.75f;
	public static final float PERIOD = 0f; // MAYBE

	public static final int UP_DELTA_X = 6;
	public static final int DOWN_DELTA_X = -4;

	// in inches
	public static final float BOTTOM_HEIGHT = 0.0f;
	public static final float TOP_HEIGHT = 38.0f;
	public static final float TOTE_HEIGHT = 12.0f;
	public static final float CAN_HEIGHT = 26.0f;

	public static final int DIGITAL_INPUT_TOP_ID = 1;
	public static final int DIGITAL_INPUT_BOTTOM_ID = 0;

	// ----------------------------------------------------------------------------------------------------------------------------------
	/*
	 * //DriveTrain or LegsDrive public static final int DRIVETRAIN = 1; public
	 * static final int LEGSDRIVE = 2; public static int DRIVETYPE = DRIVETRAIN;
	 * /
	 * /------------------------------------------------------------------------
	 * ---------------------------------------------------------- //TankDrive or
	 * ArcadeDrive public static final int TANK_DRIVE = 1; public static final
	 * int ARCADE_DRIVE = 2; public static final int DRIVEMODE = ARCADE_DRIVE;
	 * //
	 * ------------------------------------------------------------------------
	 * ---------------------------------------------------------- //Joysticks,
	 * Xbox or Snes controller. Just choose integer public static final int
	 * XBOX_CONTROLLER = 1; public static final int JOYSTICK = 2; public static
	 * final int SNES_CONTROLLER = 3; //Which one are we using? public static
	 * final int DRIVE_CONTROL = XBOX_CONTROLLER;
	 */
}