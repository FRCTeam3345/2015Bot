package org.usfirst.frc.team3345.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team3345.robot.Robot;
import org.usfirst.frc.team3345.robot.subsystems.Drivetrain;

/**
 * Move the robot according to joystick input
 */
public class GoFast extends Command {
    public GoFast() {
        requires(sanicTheHegehog);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        sanicTheHegehog.goFast(Robot.FASTNESS, Robot.oi.rightStick.getY(), Robot.oi.rightStick.getX());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
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
