package org.usfirst.frc.team1247.robot.commands;

import org.usfirst.frc.team1247.robot.commands.BaseCommand;
import org.usfirst.frc.team1247.robot.subsystems.Pneumatics;
import org.usfirst.frc.team1247.robot.OI;
import org.usfirst.frc.team1247.robot.RobotMap;
import org.usfirst.frc.team1247.robot.subsystems.Legs;
import org.usfirst.frc.team1247.robot.utils.LegRegion;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LegsCommand extends BaseCommand {

	
    public LegsCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(legs);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	System.out.println("retract legs initialization");
    	try{
    	legs.retractLeg(LegRegion.FRONT_RIGHT);
    	legs.retractLeg(LegRegion.FRONT_LEFT);
    	legs.retractLeg(LegRegion.REAR_RIGHT);
    	legs.retractLeg(LegRegion.REAR_LEFT);
    	} catch(Exception e) {
    		System.out.println("Problem initializing retract leg: " + e.getMessage());
    	}
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    	System.out.println("executing moving the legs");
    	try {
    	if (oi.getFrontRightPneumaticsButton()) {
    		legs.extendLeg(LegRegion.FRONT_RIGHT);
    		System.out.printf("Leg extend was called correctly in LegsCommand");
    	} else{
    		legs.retractLeg(LegRegion.FRONT_RIGHT);
    	}
    	if (oi.getFrontLeftPneumaticsButton()) {
    		legs.extendLeg(LegRegion.FRONT_LEFT);
    	} else{
    		legs.retractLeg(LegRegion.FRONT_LEFT);
    	} 
    	if (oi.getRearRightPneumaticsButton()) {
    		legs.extendLeg(LegRegion.REAR_RIGHT);
    	} else{
    		legs.retractLeg(LegRegion.REAR_RIGHT);
    	}
    	if (oi.getRearLeftPneumaticsButton()) {
    		legs.extendLeg(LegRegion.REAR_LEFT);
    	} else{
    		legs.retractLeg(LegRegion.REAR_LEFT);
    	}
    	} catch(Exception e){
    		System.out.println("Problem initializing leg movement execute: " + e.getMessage());
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
