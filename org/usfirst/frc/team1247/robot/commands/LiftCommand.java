package org.usfirst.frc.team1247.robot.commands;

import org.usfirst.frc.team1247.robot.utils.LiftingState;

/**
 * Command that calls the <code>update</code> method of the <code>LiftCommand</code> subsystem.
 * Extends <code>BaseCommand</code>
 * @author Zander Blasingame
 * @version v1.0.2
 */
public class LiftCommand extends BaseCommand {
	
	private LiftingState liftingState;
	
	private boolean hold;
	
	public LiftCommand() {
		requires(liftSys);
		
		hold = false;
		liftingState = LiftingState.NONE;
	}
	
	@Override
	protected void initialize() {
	
	}

	@Override
	protected void execute() {
		if (oi.getLiftButton()) {
			liftingState = LiftingState.MANUAL_UP;
			hold = false;
		}else if (oi.getReverseLiftButton()) {
			liftingState = LiftingState.MANUAL_DOWN;
			hold = false;
		}else if (oi.getToteButton() && !hold) {
			liftingState = LiftingState.TOTE_UP;
			hold = true;
		}else if (oi.getToteButtonDown() && !hold) {
			liftingState = LiftingState.TOTE_DOWN;
			hold = true;
		}else if (oi.getCanButton() && !hold) {
			liftingState = LiftingState.CAN_UP;
			hold = true;
		}else if (oi.getCanButtonDown() && !hold) {
			liftingState = LiftingState.CAN_DOWN;
			hold = true;
		}else if (!hold) {
			liftingState = LiftingState.NONE;
		}
		
		if (!liftSys.isLifting()) hold = false;
				
		liftSys.lift(liftingState);
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {		
	}

	@Override
	protected void interrupted() {		
	}
	
	
}
