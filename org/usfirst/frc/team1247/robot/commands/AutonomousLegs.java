package org.usfirst.frc.team1247.robot.commands;

import org.usfirst.frc.team1247.robot.subsystems.Legs;
import org.usfirst.frc.team1247.robot.utils.LegRegion;

import edu.wpi.first.wpilibj.command.Subsystem;

public class AutonomousLegs extends BaseCommand {
	
	private boolean isExtended, isRetracted;
//whaaaaaaaaaat I thought I knew what I was doing for maybe two minutes.
	public AutonomousLegs(LegRegion leg, boolean doExtend){
		if (doExtend){
			legs.extendLeg(leg);
		} else {
			legs.retractLeg(leg);
		}
		requires(legs);
	}
	
	public AutonomousLegs(double frontLegs, double rearLegs, boolean doExtend, LegRegion leg){
		if (doExtend){
			legs.extendLeg(leg);
		} else {
			legs.retractLeg(leg);
		}
		
		requires(legs);
	}
	
	public AutonomousLegs(double allLegs, boolean doExtend, LegRegion leg){
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
		if(!isExtended){
			
		} else {
			isRetracted = true;
		}

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
