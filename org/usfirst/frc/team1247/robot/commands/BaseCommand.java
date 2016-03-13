package org.usfirst.frc.team1247.robot.commands;

import org.usfirst.frc.team1247.robot.OI;
import org.usfirst.frc.team1247.robot.subsystems.DriveTrain;
import org.usfirst.frc.team1247.robot.subsystems.LegsDriveTrain;
import org.usfirst.frc.team1247.robot.subsystems.Pneumatics;
import org.usfirst.frc.team1247.robot.subsystems.Arm;
import org.usfirst.frc.team1247.robot.subsystems.Legs;
//import org.usfirst.frc.team1247.robot.subsystems.LegsDriveTrain;
//import org.usfirst.frc.team1247.robot.subsystems.Suction;


import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The base for the <code>LiftCommand</code> and <code>TankDrive</code> classes extends <code>Command</code>.
 * <p>
 * Creates an <code>OI</code> object and subsystems. <code>Robot</code> must call <code>init</code> method.
 * @author Zander Blasingame
 * @version v1.0.0
 */
public abstract class BaseCommand extends Command {
	
	public static OI oi;
	
	//create subsystems.
	public static DriveTrain driveTrain;
	
	public static LegsDriveTrain legsDriveTrain;
	
	public static Arm arm;
	
	public static Pneumatics pneumatics;
	
	public static Legs legs;
	
	//public static Suction suction;
	//public static Lift liftSys;
	
	public BaseCommand() {
		super();
		//System.out.println("BaseCommand initialization");
		
	}
	
	public BaseCommand(double timeout) {
		super(timeout);
	}

	public BaseCommand(String name, double timeout) {
		super(name, timeout);
	}

	public BaseCommand(String name) {
		super(name);
	}
	
	/**
	 * Initializes the subsystems and <code>OI</code>.
	 */
	public static void init() {
		oi = new OI();
		
		//Initialize subsystems.
		driveTrain = new DriveTrain();
		pneumatics = new Pneumatics();
		arm = new Arm();
		//suction = new Suction();
		legs = new Legs();
		//liftSys = new Lift();
		
		//displays stuff on smartdashboard
		SmartDashboard.putData(driveTrain);
	//	SmartDashboard.putData(liftSys);
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub

	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}
