
package org.usfirst.frc.team1247.robot;

import org.usfirst.frc.team1247.robot.commands.AutonomousMode;
import org.usfirst.frc.team1247.robot.commands.BaseCommand;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
 
	public static OI oi;
	
	AutonomousMode autonomousMode;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	//System.out.println("Robot initialization");
		oi = new OI();
		BaseCommand.init();
				
		autonomousMode = new AutonomousMode();
		
        // instantiate the command used for the autonomous period
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        // schedule the autonomous command (example)
        autonomousMode.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousMode != null) autonomousMode.cancel();
        
        oi.setControllerType();
        oi.setDriveMode();
        
        //***************very likely to break all the codes***************
        //***This might fix the arduino switching drive types on enable***
        //BaseCommand.driveTrain.initDefaultCommand();
        //**************Be sure to run simulated match********************
        //********************End terrible hack***************************
        
        switch(OI.controller){
		case XBOX_CONTROLLER:
			switch(OI.driveMode){
			case TANK_DRIVE:
				System.out.println("You are using a XBOX controller with Tank Drive.");
				break;
			case ARCADE_DRIVE:
				System.out.println("You are using a XBOX controller with Arcade Drive.");
				break;
			default:
				System.out.println(OI.driveMode);
				break;
			}
		case JOYSTICK:
			switch(OI.driveMode){
			case TANK_DRIVE:
				System.out.println("You are using joysticks with Tank Drive.");
				break;
			case ARCADE_DRIVE:
				System.out.println("You are using joysticks with Arcade Drive.");
				break;
			default:
				System.out.println(OI.driveMode);
				break;
			}
		default:
			System.out.println(OI.controller);
			break;
		}
    }

    /**b
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        LiveWindow.run();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    	Scheduler.getInstance().run();
    	LiveWindow.run();
    }
}
