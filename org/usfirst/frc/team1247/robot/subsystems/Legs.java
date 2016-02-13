package org.usfirst.frc.team1247.robot.subsystems;
 
import org.usfirst.frc.team1247.robot.RobotMap;
import org.usfirst.frc.team1247.robot.commands.LegsCommand;
import org.usfirst.frc.team1247.robot.commands.TankDrive;
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
	
	public Legs(){
		//System.out.println("Legs initialization");
		solenoids = new HashMap<LegRegion, Solenoid>();
        //System.out.println("initializing solenoids");
        try{
        solenoids.put(LegRegion.FRONT, new Solenoid(RobotMap.FRONT_LEG_SOLENOID_CHANNEL));
        solenoids.put(LegRegion.REAR_RIGHT, new Solenoid(RobotMap.REAR_RIGHT_LEG_SOLENOID_CHANNEL));
        solenoids.put(LegRegion.REAR_LEFT, new Solenoid(RobotMap.REAR_LEFT_LEG_SOLENOID_CHANNEL));
        } catch(Exception e)  {
        System.out.println("Problem Initializing Legs: " + e.getMessage());	
        
        }
	}
	
    public void initDefaultCommand() {
    	setDefaultCommand(new LegsCommand());
     }

     public void extendLeg(LegRegion leg){
   	  //System.out.println("Leg extend was called correctly for leg region"); 
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
    	 //System.out.println("Leg retract was called correctly for leg region");
    	 try {
    		 for (Map.Entry<LegRegion, Solenoid> entry: solenoids.entrySet()) {
    			 if (entry.getKey() == leg) entry.getValue().set(false);
       
    		 }
    	 } catch(Exception e) {
    		 System.out.println("Problem Initializing Legs: " + e.getMessage());
    	 }
    	 }
}

