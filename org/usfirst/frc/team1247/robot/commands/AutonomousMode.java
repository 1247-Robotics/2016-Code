package org.usfirst.frc.team1247.robot.commands;

//import org.usfirst.frc.team1247.robot.utils.LiftingState;
import org.usfirst.frc.team1247.robot.utils.LegRegion;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.CommandGroup;

import org.usfirst.frc.team1247.robot.commands.AutonomousLegs;
import org.usfirst.frc.team1247.robot.utils.AutonomousType;
import org.usfirst.frc.team1247.robot.RobotMap;
/**
 * Manages all commands for autonomous mode. Extends <code>CommandGroup</code>.
 * @author Zander Blasingame
 * @version v1.5.1
 * @see CommandGroup, Command
 */
public class AutonomousMode extends CommandGroup {
	
	public static AutonomousType autonomousType;
	Joystick arduino;
	/**
	 * Creates commands for autonomous mode.
	 */
	public AutonomousMode() {
		//System.out.println("Autonomous initialization");
		//Adds commands that autonomous will call
		
		switch(AutonomousMode.autonomousType){
		case ROUGH_TERRAIN:
			addSequential(new AutonomousDrive(1.0, 3.0));
			addSequential(new AutonomousDrive(1.0, 3.0));
			
			addSequential(new AutonomousDrive(-1.0, 3.0));
			addSequential(new AutonomousDrive(-1.0, 3.0));

			addSequential(new AutonomousDrive(1.0, 3.0));
			addSequential(new AutonomousDrive(1.0, 3.0));
			
			break;
		case ROCK_WALL:
			addSequential(new AutonomousDrive(1.0, 3.0));
			addSequential(new AutonomousDrive(1.0, 3.0));
			
			//LOOK AT THE AUTONOMOUSLEGREGION
			addSequential(new AutonomousLegs(LegRegion.REAR_LEFT));
			addSequential(new AutonomousLegs(LegRegion.REAR_RIGHT));
			
			addSequential(new AutonomousDrive(1.0, 3.0));
			addSequential(new AutonomousDrive(1.0, 3.0));
			
			addSequential(new AutonomousLegs(LegRegion.REAR_LEFT));
			addSequential(new AutonomousLegs(LegRegion.REAR_RIGHT));
			
			break;
		case MOAT:
			addSequential(new AutonomousDrive(1.0, 3.0));
			addSequential(new AutonomousDrive(1.0, 3.0));
			
			break;
		case RAMPARTS:
			addSequential(new AutonomousDrive(1.0, 3.0));
			addSequential(new AutonomousDrive(1.0, 3.0));
			
			break;
		default:
			addSequential(new AutonomousDrive(1.0, 10.0));
			addSequential(new AutonomousDrive(1.0, 10.0));
			
			break;
		}
	}

}
