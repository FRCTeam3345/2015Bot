package org.usfirst.frc.team3345.robot.commands;

import org.usfirst.frc.team3345.robot.Robot;
import org.usfirst.frc.team3345.robot.CommandBase;

/**
 *
 */
public class AutoFast extends CommandBase {
	float time;
    int counter;
    public AutoFast() {
        requires(sanicTheHegehog);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	time = 2.5;
    	counter = 0;
    	sanicTheHegehog.goFast(Robot.FASTNESS, 1, 0);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	counter++;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        if(counter == time*50) {
        	return true;
        } else {
        	return false;
        }
    }

    // Called once after isFinished returns true
    protected void end() {
        sanicTheHegehog.dontGo();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        sanicTheHegehog.dontGo();
    }
}
