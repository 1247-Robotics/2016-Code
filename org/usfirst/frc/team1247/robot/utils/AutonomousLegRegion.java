package org.usfirst.frc.team1247.robot.utils;
import org.usfirst.frc.team1247.robot.RobotMap;

public enum AutonomousLegRegion {
	FRONT(RobotMap.FRONT_LEG_SOLENOID_CHANNEL),
	REAR_RIGHT(RobotMap.REAR_RIGHT_LEG_SOLENOID_CHANNEL),
	REAR_LEFT(RobotMap.REAR_LEFT_LEG_SOLENOID_CHANNEL),
	NONE(0);
	
	private final int leg;
	
	private AutonomousLegRegion(int leg) {
		this.leg = leg;
	}
	
	public int getLegRegion() {
		return leg;
	}
	//THIS IS PROBABLY THE WORST THING EVER
}