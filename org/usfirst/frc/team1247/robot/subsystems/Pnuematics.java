package org.usfirst.frc.team1247.robot.subsystems;

import org.usfirst.frc.team1247.robot.RobotMap;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */


public class Pnuematics extends Subsystem {
    private Compressor compressor;
    
    private Solenoid pneumaticsSolenoid;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public Pnuematics(){
    	compressor = new Compressor(RobotMap.COMPRESSOR_CHANNEL);
    	compressor.setClosedLoopControl(true);
    	
    	pneumaticsSolenoid = new Solenoid(0);
        
        pneumaticsSolenoid.set(true);
    	
    }

    public void initDefaultCommand(){
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
