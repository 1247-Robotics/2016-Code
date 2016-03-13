package org.usfirst.frc.team1247.robot.commands;

//import org.usfirst.frc.team1247.robot.subsystems.LegsDriveTrain;
import org.usfirst.frc.team1247.robot.OI;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LegsDrive extends BaseCommand{
	
	private double throttle;
	
	public LegsDrive() {
		System.out.println("LegsDrive initialization");
		throttle = 1.0;
		
		requires(legsDriveTrain);
	}

	@Override
	protected void execute() {
	throttle = Math.abs(oi.getZThrottle());
	
	legsDriveTrain.legsDrive(-oi.getLeftAxis()*throttle, 
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
