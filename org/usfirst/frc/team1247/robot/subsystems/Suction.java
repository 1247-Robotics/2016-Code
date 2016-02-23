package org.usfirst.frc.team1247.robot.subsystems;

import org.usfirst.frc.team1247.robot.RobotMap;
import org.usfirst.frc.team1247.robot.commands.SuctionCommand;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */


// For getting and releasing balls.
public class Suction extends Subsystem {
   
	private Talon suctionRightTalon;
	private Talon suctionLeftTalon;
	public Suction() {
		suctionRightTalon = new Talon (RobotMap.TALON_CHANNEL_SUCTION_RIGHT);
		suctionLeftTalon = new Talon (RobotMap.TALON_CHANNEL_SUCTION_LEFT);
	}
	
	
    public void initDefaultCommand() {
    	setDefaultCommand(new SuctionCommand());
    }
    
    public void suck() {
    	suctionRightTalon.set(RobotMap.SUCTION_SPEED);
    	suctionLeftTalon.set(-RobotMap.SUCTION_SPEED); // negative to mirror right
    }
    
    public void stop() {
    	suctionRightTalon.set(RobotMap.SUCTION_STOP);
    	suctionLeftTalon.set(RobotMap.SUCTION_STOP);
    }
    
    public void blow() {
    	suctionRightTalon.set(RobotMap.BLOW_SPEED);
    	suctionLeftTalon.set(-RobotMap.BLOW_SPEED); // negative to mirror right
    }
}

