package org.usfirst.frc.team3345.robot.commands;
import org.usfirst.frc.team3345.robot.subsystems.*;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Setup subsystems and OI
 */
public class CommandBase extends Command {
    public static Drivetrain sanicTheHegehog; //gotta go fast
    public static Elevator le_élévateur;
    public static Grabber hewgleyDoodley;
    public static OI oi;

    protected void init() {
        sanicTheHegehog = new Drivetrain();
        le_élévateur = new Elevator();
        hewgleyDoodley = new Grabber();
        oi = new OI();
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
