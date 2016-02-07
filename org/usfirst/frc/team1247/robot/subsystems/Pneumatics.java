package org.usfirst.frc.team1247.robot.subsystems;

import org.usfirst.frc.team1247.robot.RobotMap;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */


public class Pneumatics extends Subsystem {
    private Compressor compressor;
    
 
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public Pneumatics(){
    	//System.out.println("Pneumatics initialization");
    	compressor = new Compressor(RobotMap.COMPRESSOR_CHANNEL);
    	compressor.setClosedLoopControl(true);
    	
    }


	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
}