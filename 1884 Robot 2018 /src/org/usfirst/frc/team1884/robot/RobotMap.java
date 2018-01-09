package org.usfirst.frc.team1884.robot;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	static VictorSP rear_left = new VictorSP(0);
	static VictorSP front_left = new VictorSP(1);
	static VictorSP rear_right = new VictorSP(2);
	static VictorSP front_right = new VictorSP(3);
	
	static SpeedControllerGroup left = new SpeedControllerGroup(rear_left,front_left);
	static SpeedControllerGroup right = new SpeedControllerGroup(rear_right,front_right);
	
	public static DifferentialDrive main_drive = new DifferentialDrive(left,right);

	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
