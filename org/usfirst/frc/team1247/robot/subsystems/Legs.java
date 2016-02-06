package org.usfirst.frc.team1247.robot.subsystems;
 
import org.usfirst.frc.team1247.robot.RobotMap;
import org.usfirst.frc.team1247.robot.subsystems.Pneumatics;
import org.usfirst.frc.team1247.robot.utils.LegRegion;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 *
 */
public class Legs extends Subsystem {

	
	private HashMap<LegRegion, Solenoid> solenoids;
	
    public void initDefaultCommand() {
        solenoids = new HashMap<LegRegion, Solenoid>();
        System.out.println("initializing solenoids");
        try{
        solenoids.put(LegRegion.FRONT_RIGHT, new Solenoid(RobotMap.FRONT_RIGHT_LEG_SOLENOID_CHANNEL));
        solenoids.put(LegRegion.FRONT_LEFT, new Solenoid(RobotMap.FRONT_LEFT_LEG_SOLENOID_CHANNEL));
        solenoids.put(LegRegion.REAR_RIGHT, new Solenoid(RobotMap.REAR_RIGHT_LEG_SOLENOID_CHANNEL));
        solenoids.put(LegRegion.REAR_LEFT, new Solenoid(RobotMap.REAR_LEFT_LEG_SOLENOID_CHANNEL));
        } catch(Exception e)  {
        System.out.println("Problem Initializing Legs: " + e.getMessage());	
        
        }
        
     }

     public void extendLeg(LegRegion leg){
   	  System.out.printf("Leg extend was called correctly for leg region %s\n", leg); 
    	 try {
    	 for (Map.Entry<LegRegion, Solenoid> entry: solenoids.entrySet()) {
          if (entry.getKey() == leg){
        	  entry.getValue().set(true);
          		}
    	 	}
       } catch(Exception e) {
        	  System.out.println("Leg Extension was not executed: " + e.getMessage());
          }
     }

     public void retractLeg(LegRegion leg){
    	 System.out.printf("Leg retract was called correctly for leg region %s\n", leg);
    	 try {
    		 for (Map.Entry<LegRegion, Solenoid> entry: solenoids.entrySet()) {
    			 if (entry.getKey() == leg) entry.getValue().set(false);
       
    		 }
    	 } catch(Exception e) {
    		 System.out.println("Problem Initializing Legs: " + e.getMessage());
    	 }
    	 }
}

