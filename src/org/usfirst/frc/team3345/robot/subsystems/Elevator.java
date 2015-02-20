package org.usfirst.frc.team3345.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team3345.robot.RobotMap;
/**
 *@author Brandon Verkamp
 *@authored 16-2-2015
 *@finalized [in progress]
 */

//This will be le_élévateur
public class Elevator extends Subsystem {
    //get the motor and limit switch from RobotMap
	VictorSP ascenseur = RobotMap.elevator;
	DigitalInput finDuTrajet = RobotMap.elevatorTopper,
			débutDeLaVoie = RobotMap.elevatorBaser;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    //TODO: program limits (with a secondsToTop variable)
    /**
     * Lift the elevator
     */
    public void gravir(double vitesse) {
    	ascenseur.set(vitesse);
    }
    
    /**
     * Lower the elevator
     */
    public void escendre(double vitesse) {
    	ascenseur.set(-vitesse);
    }
    
    /**
     * Stop the elevator
     */
    public void fin() {
    	ascenseur.set(0);
    }
    
    /**
     * Check if the elevator top limit switch has been hit
     */
    public boolean estMaximisé() {
    	return finDuTrajet.get();
    }
    
    /**
     * Check if the elevator bottom limit switch has been hit
     */
    public boolean estMinimisé() {
    	return débutDeLaVoie.get();
    }
}

