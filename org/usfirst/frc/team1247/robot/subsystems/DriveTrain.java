package org.usfirst.frc.team1247.robot.subsystems;

import org.usfirst.frc.team1247.robot.RobotMap;
import org.usfirst.frc.team1247.robot.commands.TankDrive;
import org.usfirst.frc.team1247.robot.commands.ArcadeDrive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Subsystem that controls the drivetrain of the robot.
 * Extends <code>Subsystem</code>.
 * @author Zander Blasingame
 * @version v1.0.0
 * @see Subsystem
 */
public class DriveTrain extends Subsystem{
	private Talon talonLeft, talonRight;
		
	private RobotDrive drive;
	
	public DriveTrain() {
		talonLeft = new Talon(RobotMap.TALON_CHANNEL_LEFT);
		talonRight = new Talon(RobotMap.TALON_CHANNEL_RIGHT);
		
		drive = new RobotDrive(talonLeft, talonRight);
	}
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new TankDrive());
		setDefaultCommand(new ArcadeDrive());
	}
	
	public void tankDrive(double left, double right) {
		drive.tankDrive(left, right);
	}

	public void arcadeDrive(double left, double right) {
		drive.arcadeDrive(left, right);
	}
}
