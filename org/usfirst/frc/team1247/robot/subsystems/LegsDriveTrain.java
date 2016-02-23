package org.usfirst.frc.team1247.robot.subsystems;

import org.usfirst.frc.team1247.robot.OI;
import org.usfirst.frc.team1247.robot.RobotMap;
import org.usfirst.frc.team1247.robot.commands.ArcadeDrive;
import org.usfirst.frc.team1247.robot.commands.LegsDrive;
import org.usfirst.frc.team1247.robot.commands.LegsArcadeDrive;
import org.usfirst.frc.team1247.robot.commands.TankDrive;
import org.usfirst.frc.team1247.robot.utils.DriveMode;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LegsDriveTrain extends Subsystem {
    
	private Talon talonRight, talonLeft;
	private RobotDrive legsDrive;
	DriveMode driveMode;

	public LegsDriveTrain() {
		talonRight = new Talon(RobotMap.LEG_TALON_CHANNEL_RIGHT);
		talonLeft = new Talon(RobotMap.LEG_TALON_CHANNEL_LEFT);
		
		legsDrive = new RobotDrive(talonRight, talonLeft);
	}
	
	@Override
	protected void initDefaultCommand() {
		switch(this.driveMode){
		case TANK_DRIVE:
			setDefaultCommand(new LegsDrive());
			break;
		case ARCADE_DRIVE:
			setDefaultCommand(new LegsArcadeDrive());
			break;
		}
		
		if (OI.driveMode == DriveMode.TANK_DRIVE) {
			
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

