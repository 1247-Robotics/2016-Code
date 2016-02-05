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

        solenoids.put(LegRegion.FRONT_RIGHT, new Solenoid(RobotMap.FRONT_RIGHT_LEG_SOLENOID_CHANNEL));
        solenoids.put(LegRegion.FRONT_LEFT, new Solenoid(RobotMap.FRONT_LEFT_LEG_SOLENOID_CHANNEL));
        solenoids.put(LegRegion.REAR_RIGHT, new Solenoid(RobotMap.REAR_RIGHT_LEG_SOLENOID_CHANNEL));
        solenoids.put(LegRegion.REAR_LEFT, new Solenoid(RobotMap.REAR_LEFT_LEG_SOLENOID_CHANNEL));

     }

     public void extendLeg(LegRegion leg){
       for (Map.Entry<LegRegion, Solenoid> entry: solenoids.entrySet()) {
          if (entry.getKey() == leg) entry.getValue().set(true);
       }
    }

     public void retractLeg(LegRegion leg){
       for (Map.Entry<LegRegion, Solenoid> entry: solenoids.entrySet()) {
          if (entry.getKey() == leg) entry.getValue().set(false);
       }
     }
}

