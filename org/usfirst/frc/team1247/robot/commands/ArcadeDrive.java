package org.usfirst.frc.team1247.robot.commands;

import org.usfirst.frc.team1247.robot.OI;
import org.usfirst.frc.team1247.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ArcadeDrive extends BaseCommand {
	
	private double throttle;
	
	public ArcadeDrive() {
		//System.out.println("ArcadeDrive initialization");
		throttle = 1.0;
		
		requires(driveTrain);

	}

	@Override
	protected void execute() {
		//System.out.println("ArcadeDrive execution");
		throttle = Math.abs(oi.getZThrottle());
		
		driveTrain.arcadeDrive(-oi.getYAxis()*throttle,
							  -oi.getXAxis()*throttle);
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
