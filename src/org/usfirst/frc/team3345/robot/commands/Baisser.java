package org.usfirst.frc.team3345.robot.commands;

import org.usfirst.frc.team3345.robot.Robot;
import org.usfirst.frc.team3345.robot.CommandBase;

/**
 * Lower the elevator
 */
public class Baisser extends CommandBase {
    public Baisser() {
        requires(le_élévateur);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	elevator.escendre(Robot.ASCENSEUR);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return elevator.estMinimisé();
    }

    // Called once after isFinished returns true
    protected void end() {
    	elevator.fin();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	elevator.fin();
    }
}
