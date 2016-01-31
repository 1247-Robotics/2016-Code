package org.usfirst.frc.team1247.robot.subsystems;

import org.usfirst.frc.team1247.robot.RobotMap;
import org.usfirst.frc.team1247.robot.commands.LegsDrive;
import org.usfirst.frc.team1247.robot.commands.LegsArcadeDrive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LegsDriveTrain extends Subsystem {
    
	private Talon talonRight, talonLeft;
	private RobotDrive legsDrive;

	public LegsDriveTrain() {
		talonRight = new Talon(RobotMap.LEG_TALON_CHANNEL_RIGHT);
		talonLeft = new Talon(RobotMap.LEG_TALON_CHANNEL_LEFT);
		
		legsDrive = new RobotDrive(talonRight, talonLeft);
	}
	
	@Override
	protected void initDefaultCommand() {
		if (RobotMap.DRIVEMODE == RobotMap.TANK_DRIVE) {
			
			setDefaultCommand(new LegsDrive());
		
		} else {
	
			setDefaultCommand(new LegsArcadeDrive());
		
		}
	}
	
	public void legsDrive(double left, double right) {
		legsDrive.tankDrive(left, right);
	}
	
	public void legsArcadeDrive(double left, double right) {
		legsDrive.arcadeDrive(left,right);
	}
}

