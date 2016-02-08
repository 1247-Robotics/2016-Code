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
    	//System.out.println("LegsCommand initialization");
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(legs);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	super.initialize();
    	
    	//System.out.println("retract legs initialization");
    	
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
    	//System.out.println("executing moving the legs\n");
    	try {
    	if (oi.getFrontRightPneumaticsButton()) {
    		legs.extendLeg(LegRegion.FRONT_RIGHT);
    		//System.out.printf("->Front Right");
    	} else{
    		legs.retractLeg(LegRegion.FRONT_RIGHT);
    	}
    	if (oi.getFrontLeftPneumaticsButton()) {
    		legs.extendLeg(LegRegion.FRONT_LEFT);
    		//System.out.printf("->Front Left");

    	} else{
    		legs.retractLeg(LegRegion.FRONT_LEFT);
    	} 
    	if (oi.getRearRightPneumaticsButton()) {
    		legs.extendLeg(LegRegion.REAR_RIGHT);
    		//System.out.printf("->Rear Right");

    	} else{
    		legs.retractLeg(LegRegion.REAR_RIGHT);
    	}
    	if (oi.getRearLeftPneumaticsButton()) {
    		legs.extendLeg(LegRegion.REAR_LEFT);
    		//System.out.printf("->Rear Left");

    	} else{
    		legs.retractLeg(LegRegion.REAR_LEFT);
    	}
    	} catch(Exception e){
    		System.out.println("Problem initializing leg movement execute: " + e.getMessage());
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return super.isFinished();
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		super.end();
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		super.interrupted();
	}
}
