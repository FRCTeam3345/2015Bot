package org.usfirst.frc.team3345.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team3345.robot.Robot;
import org.usfirst.frc.team3345.robot.subsystems.Grabber;

/**
 * This will open the grabber
 */
public class DoodleyDooo extends Command {
    public DoodleyDooo() {
    	requires(hewgleyDoodley);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        hewgleyDoodley.dooo(Robot.DOODLEY_SPEED);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    //TODO: Add a limit switch and test for it 
    protected boolean isFinished() {
        return hewgleyDoodley.isDiddlyOpened();
    }

    // Called once after isFinished returns true
    protected void end() {
        hewgleyDoodley.doodleyDont();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        hewgleyDoodley.doodleyDont();
    }
}
