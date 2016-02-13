package org.usfirst.frc.team1247.robot.subsystems;

import org.usfirst.frc.team1247.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */


// For getting and releasing balls.
public class Suction extends Subsystem {
   
	private Talon suctionTalon;
   
	public Suction() {
		suctionTalon = new Talon (RobotMap.TALON_CHANNEL_SUCTION);
	}
	
	
    public void initDefaultCommand() {

    }
    
    public void suck() {
    	suctionTalon.set(RobotMap.SUCTION_SPEED);
    }
    
    public void stop() {
    	suctionTalon.set(RobotMap.SUCTION_STOP);
    }
    
    public void blow() {
    	suctionTalon.set(RobotMap.BLOW_SPEED);
    }
}

