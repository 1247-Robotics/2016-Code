package org.usfirst.frc.team1247.robot.commands;

import org.usfirst.frc.team1247.robot.subsystems.Pnuematics;

import org.usfirst.frc.team1247.robot.OI;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class PneumaticsCommand extends BaseCommand {

    public PneumaticsCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    	if (oi.getFrontLeftPneumaticsButton()) {
    	
    	}
    	else if (oi.getFrontRightPneumaticsButton()) {
    		
    	}
    	else if (oi.getRearLeftPneumaticsButton()) {
    		
    	}
    	else if (oi.getRearRightPneumaticsButton()) {
    		
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
