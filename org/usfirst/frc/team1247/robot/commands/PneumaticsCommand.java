package org.usfirst.frc.team1247.robot.commands;

import org.usfirst.frc.team1247.robot.subsystems.Pnuematics;
import org.usfirst.frc.team1247.robot.OI;
import org.usfirst.frc.team1247.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class PneumaticsCommand extends BaseCommand {

	
    public PneumaticsCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(pnuematics);
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	pnuematics.retractLeg(RobotMap.FRONT_RIGHT_LEG);
    	pnuematics.retractLeg(RobotMap.FRONT_LEFT_LEG);
    	pnuematics.retractLeg(RobotMap.REAR_RIGHT_LEG);
    	pnuematics.retractLeg(RobotMap.REAR_LEFT_LEG);
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    	if (oi.getFrontRightPneumaticsButton()) {
    		pnuematics.extendLeg(RobotMap.FRONT_RIGHT_LEG);
    	}
    	else{
    		pnuematics.retractLeg(RobotMap.FRONT_RIGHT_LEG);
    	}
    	if (oi.getFrontLeftPneumaticsButton()) {
    		pnuematics.extendLeg(RobotMap.FRONT_LEFT_LEG);
    	}
    	else{
    		pnuematics.retractLeg(RobotMap.FRONT_LEFT_LEG);
    	}
    	if (oi.getRearRightPneumaticsButton()) {
    		pnuematics.extendLeg(RobotMap.REAR_RIGHT_LEG);
    	}
    	else{
    		pnuematics.retractLeg(RobotMap.REAR_RIGHT_LEG);
    	}
    	if (oi.getRearLeftPneumaticsButton()) {
    		pnuematics.extendLeg(RobotMap.REAR_LEFT_LEG);
    	}
    	else{
    		pnuematics.retractLeg(RobotMap.REAR_LEFT_LEG);
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
