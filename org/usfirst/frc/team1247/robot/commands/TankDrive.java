package org.usfirst.frc.team1247.robot.commands;

/**
 * Command that calls the <code>tankDrive</code> method of the <code>DriveTrain</code> subsystem.
 * Extends <code>BaseCommand</code>
 * @author Zander Blasingame
 * @version v2.0.1
 *
 */
public class TankDrive extends BaseCommand{
	
	private double throttle;
	
	public TankDrive() {
		throttle = 1.0;
		
		requires(driveTrain);
	}

	@Override
	protected void execute() {
		throttle = Math.abs(oi.getZThrottle());
		throttle = -0.60*throttle + 1;
		
		driveTrain.tankDrive(-oi.getLeftAxis()*throttle*.50, 
							 -oi.getRightAxis()*throttle*.50);
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
