package org.usfirst.frc.team1247.robot.commands;

import org.usfirst.frc.team1247.robot.OI;
import org.usfirst.frc.team1247.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LegsArcadeDrive extends BaseCommand {
	
	private double throttle;
	
	public LegsArcadeDrive() {
		System.out.println("LegsArcadeDrive initialization");
		throttle = 1.0;
		
		//requires(legsDrive);
	}

	@Override
	protected void execute() {
		throttle = Math.abs(oi.getZThrottle());
		
		//legsDrive.legsArcadeDrive(-oi.getYAxis()*throttle, 
			//		 			  -oi.getXAxis()*throttle);
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		super.initialize();
	}

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
