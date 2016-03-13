package org.usfirst.frc.team1247.robot.commands;

import org.usfirst.frc.team1247.robot.subsystems.Arm;
import org.usfirst.frc.team1247.robot.OI;
import org.usfirst.frc.team1247.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class ArmCommand extends BaseCommand {
		

	
	public ArmCommand() {
		System.out.println("Arm initialization");
		
		requires(arm);

	}

	@Override
	protected void execute() {
		//System.out.println("ArcadeDrive execution")
		
		arm.swing(oi.getArmYAxis()*RobotMap.ARM_SPEED_MULTIPLIER);
		arm.swing(oi.getArmXAxis()*RobotMap.ARM_SPEED_MULTIPLIER);
	}
	    
	protected void initialize() {
		
	}

	
    protected boolean isFinished() {
        return false;
    }
    
    protected void end() {
    }
    
    protected void interrupted() {
    }
}
