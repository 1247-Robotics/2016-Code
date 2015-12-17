package org.usfirst.frc.team1247.robot.commands;

import org.usfirst.frc.team1247.robot.utils.LiftingState;

/**
 * The command for controlling the <code>Lift</code> subsystem during autonomous mode.
 * Extends <code>BaseCommand</code>.
 * @author Zander Blasingame
 * @version v1.1.0
 * @see BaseCommand
 *
 */
public class AutonomousLift extends BaseCommand {
	
	LiftingState liftingState;
	
	/**
	 * Creates an <code>AutonomousLift</code> command.
	 * @param liftingState An <code>enum</code> for the state in which the command will lift.
	 * @see LiftingState
	 */
	public AutonomousLift(LiftingState liftingState) {
		this.liftingState = liftingState;
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
	 * Lifts or lowers an object based on the given parameter for liftingState.
	 */
	@Override
	protected void execute() {
		liftSys.lift(liftingState);
	}

	/* (non-Javadoc)
	 * @see org.usfirst.frc.team1247.robot.commands.BaseCommand#isFinished()
	 */
	@Override
	protected boolean isFinished() {
		return !liftSys.isLifting();
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
