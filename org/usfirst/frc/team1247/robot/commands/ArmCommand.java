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
	    
	protected void initialize() {
		
	}
	
	@Override
	protected void execute() {
		
	}
	
    protected boolean isFinished() {
        return false;
    }
    
    protected void end() {
    }
    
    protected void interrupted() {
    }
}
