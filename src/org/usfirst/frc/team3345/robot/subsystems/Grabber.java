package org.usfirst.frc.team3345.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team3345.robot.RobotMap;
/**
 *@author Brandon Verkamp
 *@authored 16-2-2015
 *@finalized [in progress]
 */

//This will be HEWGLEY_DOODLEY
public class Grabber extends Subsystem {
    //get the motor and limit switch from RobotMap
	Talon doodleyDoer = RobotMap.armMover;
	DigitalInput doodleyOpenLimiter = RobotMap.armOpenSwitch,
			doodleyCloseLimiter = RobotMap.armCloseSwitch;
	

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    //TODO: program limits maybe (with an Open/CloseTime variable)
    /**
     * Open the arm at a certain speed
     */
    public void dooo(double speed) {
    	doodleyDoer.set(speed);
    }
    
    /**
     * Close the arm at a certain speed
     */
    public void undooo(double speed) {
    	doodleyDoer.set(-speed);
    }
    
    /**
     * Stop the motor
     */
    public void doodleyDont() {
    	doodleyDoer.set(0);
    }
    
    /**
     * Check if the arm limit switch has been hit
     */
    public boolean isDiddlyOpened() {
    	return doodleyOpenLimiter.get();
    }
    
    public boolean isDiddlyClosed() {
    	return doodleyCloseLimiter.get();
    }
}
