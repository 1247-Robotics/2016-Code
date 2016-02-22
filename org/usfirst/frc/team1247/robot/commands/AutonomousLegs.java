package org.usfirst.frc.team1247.robot.commands;

import org.usfirst.frc.team1247.robot.subsystems.Legs;
import org.usfirst.frc.team1247.robot.utils.LegRegion;

import edu.wpi.first.wpilibj.command.Subsystem;

public class AutonomousLegs extends BaseCommand {
	
	private boolean isExtended, isRetracted;

	public AutonomousLegs(LegRegion leg, boolean doExtend){
		if (doExtend){
			legs.extendLeg(leg);
		} else {
			legs.retractLeg(leg);
		}
		requires(legs);
	}
	
	@Override
	protected void initialize() {
		super.initialize();
	}
	
	@Override
	protected void execute() {
		super.execute();
	}

	/* (non-Javadoc)  
	 * @see org.usfirst.frc.team1247.robot.commands.BaseCommand#isFinished()
	 */
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return super.isFinished();
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
