package org.usfirst.frc.team3345.robot.commands;

import org.usfirst.frc.team3345.robot.Robot;
import org.usfirst.frc.team3345.robot.subsystems.Elevator;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Raise the elevator 
 */
public class Soulever extends CommandBase {
    public Soulever() {
        requires(le_élévateur);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        le_élévateur.gravir(Robot.ASCENSEUR);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return le_élévateur.estMaximisé();
    }

    // Called once after isFinished returns true
    protected void end() {
        le_élévateur.fin();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        le_élévateur.fin();
    }
}
