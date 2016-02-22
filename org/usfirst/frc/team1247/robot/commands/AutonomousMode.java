package org.usfirst.frc.team1247.robot.commands;

//import org.usfirst.frc.team1247.robot.utils.LiftingState;
import org.usfirst.frc.team1247.robot.utils.LegRegion;
import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc.team1247.robot.commands.AutonomousLegs;
/**
 * Manages all commands for autonomous mode. Extends <code>CommandGroup</code>.
 * @author Zander Blasingame
 * @version v1.5.1
 * @see CommandGroup, Command
 */
public class AutonomousMode extends CommandGroup {
	
	/**
	 * Creates commands for autonomous mode.
	 */
	public AutonomousMode() {
		//System.out.println("Autonomous initialization");
		//Adds commands that autonomous will call
		
		//addSequential(new AutonomousLift(LiftingState.CAN_DOWN));
		addSequential(new AutonomousDrive(0.5, 0.25));
		//addSequential(new AutonomousLift(LiftingState.CAN_UP));
		addSequential(new AutonomousDrive(0.75, 2.5));
		
		//testing
		addSequential(new AutonomousDrive(0.75, 3.0));
		
		addSequential(new AutonomousDrive(.75, 1.5));
		//addSequential(new AutonomousLift(LiftingState.TOTE_UP));
		addSequential(new AutonomousDrive(-0.75, 1.5));
		//addSequential(new AutonomousLift(LiftingState.TOTE_DOWN));
		addSequential(new AutonomousDrive(-0.5, 0.2));
		
		//autonomous legs
		addSequential(new AutonomousLegs(LegRegion.REAR_LEFT, true));
		addSequential(new AutonomousLegs(LegRegion.REAR_RIGHT, true));
		addSequential(new AutonomousLegs(LegRegion.FRONT, true));
	}

}
