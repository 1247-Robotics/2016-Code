package org.usfirst.frc.team1247.robot.subsystems;

import org.usfirst.frc.team1247.robot.RobotMap;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */


public class Pnuematics extends Subsystem {
    private Compressor compressor;
    
    private Solenoid frontRightLegSolenoid;
    private Solenoid frontLeftLegSolenoid;
    private Solenoid rearRightLegSolenoid;
    private Solenoid rearLeftLegSolenoid;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public Pnuematics(){
    	compressor = new Compressor(RobotMap.COMPRESSOR_CHANNEL);
    	compressor.setClosedLoopControl(true);
    	
    	frontRightLegSolenoid = new Solenoid(RobotMap.FRONT_RIGHT_LEG_SOLENOID_CHANNEL);
    	frontLeftLegSolenoid = new Solenoid(RobotMap.FRONT_LEFT_LEG_SOLENOID_CHANNEL);
    	rearRightLegSolenoid = new Solenoid(RobotMap.REAR_RIGHT_LEG_SOLENOID_CHANNEL);
    	rearLeftLegSolenoid = new Solenoid(RobotMap.REAR_LEFT_LEG_SOLENOID_CHANNEL);
    	
    }
    
    public void extendLeg(int leg){
    	if (leg == RobotMap.FRONT_RIGHT_LEG){
    		frontRightLegSolenoid.set(true);
    		}
    	else if (leg == RobotMap.FRONT_LEFT_LEG){
    		frontLeftLegSolenoid.set(true);
    		}
    	else if (leg == RobotMap.REAR_RIGHT_LEG){
    		rearRightLegSolenoid.set(true);
    		}
    	else if (leg == RobotMap.REAR_LEFT_LEG){
    		rearLeftLegSolenoid.set(true);
    		}
    	}
    
    public void retractLeg(int leg){
    	if (leg == RobotMap.FRONT_RIGHT_LEG){
    		frontRightLegSolenoid.set(false);
    	}
    	if (leg == RobotMap.FRONT_LEFT_LEG){
    		frontLeftLegSolenoid.set(false);
    	}
    	if (leg == RobotMap.REAR_RIGHT_LEG){
    		rearRightLegSolenoid.set(false);
    	}
    	if (leg == RobotMap.REAR_LEFT_LEG){
    		rearLeftLegSolenoid.set(false);
    	}
    }

    public void initDefaultCommand(){
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
