package org.usfirst.frc.team1247.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	//Magic numbers go here!	
	public static final int JOYSTICK_LEFT_ID = 1;
	public static final int JOYSTICK_RIGHT_ID = 0;
	public static final int JOYSTICK_YAXIS_ID = 1;
	public static final int JOYSTICK_XAXIS_ID = 0;
	public static final int JOYSTICK_LIFT_BUTTON_ID = 1;
	public static final int JOYSTICK_REVERSE_LIFT_BUTTON_ID = 1;
	public static final int JOYSTICK_TOTE_UP_BUTTON_ID = 3;
	public static final int JOYSTICK_TOTE_DOWN_BUTTON_ID = 2;
	public static final int JOYSTICK_CAN_UP_BUTTON_ID = 3;
	public static final int JOYSTICK_CAN_DOWN_BUTTON_ID = 2;
	public static final int JOYSTICK_REVERSE_BUTTON_ID = 4;
	
	public static final int TALON_CHANNEL_LEFT = 0;
	public static final int TALON_CHANNEL_RIGHT = 1;
	public static final int TALON_CHANNEL_LIFT = 2;
	
	public static final int ENCODER_CHANNEL_LIFT_A = 8;
	public static final int ENCODER_CHANNEL_LIFT_B = 9;
	
	
	//for PID controller.
	public static final float PROPORTIONAL_GAIN = 0.55f;
	public static final float INTEGRAL_GAIN = 0.35f;
	public static final float DERIVATIVE_GAIN = 0.75f;
	public static final float PERIOD = 0f; //MAYBE
	
	public static final int UP_DELTA_X = 6;
	public static final int DOWN_DELTA_X = -4;
	
	//in inches
	public static final float BOTTOM_HEIGHT = 0.0f;
	public static final float TOP_HEIGHT = 38.0f;
	public static final float TOTE_HEIGHT = 12.0f;
	public static final float CAN_HEIGHT = 26.0f;
	
	public static final int DIGITAL_INPUT_TOP_ID = 1;
	public static final int DIGITAL_INPUT_BOTTOM_ID = 0;
	
}
