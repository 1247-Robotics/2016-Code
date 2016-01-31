package org.usfirst.frc.team1247.robot.commands;

import org.usfirst.frc.team1247.robot.subsystems.LegsDriveTrain;
import org.usfirst.frc.team1247.robot.OI;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LegsDrive extends BaseCommand{
	
	private double throttle;
	
	public LegsDrive() {
		throttle = 1.0;
		
		requires(legsDrive);
	}

	@Override
	protected void execute() {
	throttle = Math.abs(oi.getZThrottle());
	
	legsDrive.legsDrive(-oi.getLeftAxis()*throttle, 
						-oi.getRightAxis()*throttle);
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
