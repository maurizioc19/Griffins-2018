package org.usfirst.frc.team1884.robot.commands;


import org.usfirst.frc.team1884.robot.Robot;
import org.usfirst.frc.team1884.robot.subsystems.Drivetrain;
import org.usfirst.frc.team1884.util.XBox360;

import edu.wpi.first.wpilibj.command.Command;


/**
 *
 */
public class Drive extends Command {

    public Drive() {
    	requires(Robot.drivetrain);
    	// eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drivetrain.teleopDrive(Robot.oi.Driver.getLeftTrigger(), Robot.oi.Driver.getRightTrigger());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
