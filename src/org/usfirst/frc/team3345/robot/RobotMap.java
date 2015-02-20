package org.usfirst.frc.team3345.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.VictorSP;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    //Map the motors to their respective ports
	public static Talon leftDrive = new Talon(0),
			rightDrive = new Talon(1),
			armMover = new Talon(2);
	public static VictorSP elevator = new VictorSP(3);
	
	public static DigitalInput elevatorTopper = new DigitalInput(0),
			elevatorBaser = new DigitalInput(1),
			armOpenSwitch = new DigitalInput(2),
			armCloseSwitch = new DigitalInput(3);
			
}
