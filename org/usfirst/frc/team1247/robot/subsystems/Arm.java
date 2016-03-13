package org.usfirst.frc.team1247.robot.subsystems;

import org.usfirst.frc.team1247.robot.RobotMap;
import org.usfirst.frc.team1247.robot.commands.ArmCommand;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Talon;

public class Arm extends Subsystem {
	
	private Talon armTalonY;
	private Talon armTalonX;
	
	public Arm () {
		armTalonY = new Talon (RobotMap.TALON_CHANNEL_ARM_Y);
		armTalonX = new Talon (RobotMap.TALON_CHANNEL_ARM_X); 
		
	}
	


	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
		setDefaultCommand(new ArmCommand());

		
	}
	public void swing(double speed) {
		armTalonY.set(speed);
		armTalonX.set(speed);
	}
	
}
