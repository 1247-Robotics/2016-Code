package org.usfirst.frc.team1247.robot.subsystems;

import org.usfirst.frc.team1247.robot.OI;
import org.usfirst.frc.team1247.robot.RobotMap;
import org.usfirst.frc.team1247.robot.commands.TankDrive;
import org.usfirst.frc.team1247.robot.commands.ArcadeDrive;
import org.usfirst.frc.team1247.robot.utils.DriveMode;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * Subsystem that controls the drivetrain of the robot.
 * Extends <code>Subsystem</code>.
 * @author Zander Blasingame
 * @version v1.0.0
 * @see Subsystem
 */
public class DriveTrain extends Subsystem{
	private Talon talonLeft, talonRight;
		
	//DriveMode driveMode;
	
	private RobotDrive drive;
	
	public DriveTrain() {
		//System.out.println("DriveTrain initialization");
		talonLeft = new Talon(RobotMap.TALON_CHANNEL_LEFT);
		talonRight = new Talon(RobotMap.TALON_CHANNEL_RIGHT);
		
		LiveWindow.addActuator("left","talonLeft", talonLeft);
		LiveWindow.addActuator("right","talonRight", talonRight);
		
		drive = new RobotDrive(talonLeft, talonRight);
		drive.setSafetyEnabled(false);
	}
	
	
	@Override
	protected void initDefaultCommand() {
		/*switch(OI.driveMode){
		case TANK_DRIVE:
			setDefaultCommand(new TankDrive());
			break;
		case ARCADE_DRIVE:
			setDefaultCommand(new ArcadeDrive());
			break;
		}*/
		
		if (OI.driveMode == DriveMode.TANK_DRIVE) {
			
			setDefaultCommand(new TankDrive());
		
		} else {
	
			setDefaultCommand(new ArcadeDrive());
		
		}
	}
	
	public void tankDrive(double left, double right) {
		drive.tankDrive(left, right);
	}

	public void arcadeDrive(double left, double right) {
	//	System.out.println("Arcade Drive did a thing.");
		drive.arcadeDrive(left, right);
	
	}
}
