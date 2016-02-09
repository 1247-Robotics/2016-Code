package org.usfirst.frc.team1247.robot.commands;

public class AutonomousLegs extends BaseCommand {
	
	public AutonomousLegs(){
		
		requires(legs);
	}
	
	@Override
	protected void execute() {

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
