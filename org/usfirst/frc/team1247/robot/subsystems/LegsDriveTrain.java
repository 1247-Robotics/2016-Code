package org.usfirst.frc.team1247.robot.subsystems;

import org.usfirst.frc.team1247.robot.RobotMap;
import org.usfirst.frc.team1247.robot.commands.TankDrive;
import org.usfirst.frc.team1247.robot.commands.ArcadeDrive;


import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LegsDriveTrain extends Subsystem {
    
	private Talon talonRight, talonLeft;
	private RobotDrive drive;

	public LegsDriveTrain() {
		talonRight = new Talon(RobotMap.LEG_TALON_CHANNEL_RIGHT);
		talonLeft = new Talon(RobotMap.LEG_TALON_CHANNEL_LEFT);
		
		drive = new RobotDrive(talonRight, talonLeft);
	}
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new TankDrive());
		setDefaultCommand(new ArcadeDrive());
		}
	
	public void legsDrive(double left, double right) {
		drive.tankDrive(left, right);
	}
	
	public void legsArcadeDrive(double left, double right) {
		drive.arcadeDrive(left,right);
	}
}

