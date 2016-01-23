package org.usfirst.frc.team1247.robot.subsystems;

import org.usfirst.frc.team1247.robot.RobotMap;
import org.usfirst.frc.team1247.robot.commands.TankDrive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LegsDriveTrain extends Subsystem {
    
	private Talon talonFrontRight, talonFrontLeft, talonRearRight, talonRearLeft;
	private RobotDrive drive;

	public LegsDriveTrain() {
		talonFrontRight = new Talon(RobotMap.LEG_TALON_CHANNEL_FRONT_RIGHT);
		talonFrontLeft = new Talon(RobotMap.LEG_TALON_CHANNEL_FRONT_LEFT);
		talonRearRight = new Talon(RobotMap.LEG_TALON_CHANNEL_REAR_RIGHT);
		talonRearLeft = new Talon(RobotMap.LEG_TALON_CHANNEL_REAR_LEFT);
		
		drive = new RobotDrive(talonFrontRight, talonFrontLeft, talonRearRight, talonRearLeft);
	}
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new TankDrive());
	}
	
	public void tankDrive(double left, double right) {
		drive.tankDrive(left, right);
	}
}

