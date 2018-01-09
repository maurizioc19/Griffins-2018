package org.usfirst.frc.team1884.robot.subsystems;

import org.usfirst.frc.team1884.robot.Robot;
import org.usfirst.frc.team1884.robot.RobotMap;
import org.usfirst.frc.team1884.robot.commands.Drive;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public Drivetrain()
	{
		
	}
	public void teleopDrive(double value,double value2){
		RobotMap.main_drive.tankDrive(value,value2);
	}
	
	
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new Drive());
    	
    	
    }
}

