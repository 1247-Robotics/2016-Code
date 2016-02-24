package org.usfirst.frc.team1247.robot.subsystems;

import org.usfirst.frc.team1247.robot.RobotMap;
import org.usfirst.frc.team1247.robot.commands.ArmCommand;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Talon;

public class Arm extends Subsystem {
	
	private Talon armTalon;
	
	
	public Arm () {
		armTalon = new Talon (RobotMap.TALON_CHANNEL_ARM);
		
	}
	


	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
		setDefaultCommand(new ArmCommand());

		
	}
	public void swing(double speed) {
		armTalon.set(speed);
	}
	
}
