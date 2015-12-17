package org.usfirst.frc.team1247.robot.commands;

import edu.wpi.first.wpilibj.Timer;

/**
 * The command for driving during autonomous. Extends <code>BaseCommand</code>.
 * @author Zander Blasingame
 * @version v1.1.2
 * @see BaseCommand
 */
public class AutonomousDrive extends BaseCommand {
	
	private double speedLeft, speedRight, duration;
	
	private boolean isDriving, isFinished;
	
	private Timer timer;
	
	/**
	 * Creates an AutonomousDrive command.
	 * @param speedLeft The speed of the left motor from -1.0 to 1.0
	 * @param speedRight The speed of the right motor from -1.0 to 1.0
	 * @param duration The duration of the drive command in seconds.
	 */
	public AutonomousDrive(double speedLeft, double speedRight, double duration) {
		this.speedLeft = speedLeft;
		this.speedRight = speedRight;
		
		this.duration = duration;
		
		isDriving = isFinished = false;
		
		timer = new Timer();
		
		requires(driveTrain);
	}
	
	/**
	 * Creates an AutonomousDrive command.
	 * @param speed The speed of both motors from -1.0 to 1.0
	 * @param duration The duration of the drive command in seconds.
	 */
	public AutonomousDrive(double speed, double duration) {
		this.speedLeft = speed;
		this.speedRight = speed;
		this.duration = duration;
		
		isDriving = isFinished = false;
		
		timer = new Timer();
		
		requires(driveTrain);
	}

	/* (non-Javadoc)
	 * @see org.usfirst.frc.team1247.robot.commands.BaseCommand#initialize()
	 */
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		super.initialize();
	}

	/**
	 * Executes autonomous driving code.
	 */
	@Override
	protected void execute() {
		if (!isDriving) {
			timer.start();
			isDriving = true;
		}
		
		if (timer.get() < duration) driveTrain.tankDrive(speedLeft, speedRight);
		else isFinished = true;
	}

	/* (non-Javadoc)
	 * @see org.usfirst.frc.team1247.robot.commands.BaseCommand#isFinished()
	 */
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return isFinished;
	}

	/* (non-Javadoc)
	 * @see org.usfirst.frc.team1247.robot.commands.BaseCommand#end()
	 */
	@Override
	protected void end() {
		// TODO Auto-generated method stub
		super.end();
	}

	/* (non-Javadoc)
	 * @see org.usfirst.frc.team1247.robot.commands.BaseCommand#interrupted()
	 */
	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		super.interrupted();
	}
	
	
	
}
