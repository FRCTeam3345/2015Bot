package org.usfirst.frc.team3345.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team3345.robot.Robot;
import org.usfirst.frc.team3345.robot.RobotMap;
import org.usfirst.frc.team3345.robot.commands.GoFast;
/**
 *@author Brandon Verkamp
 *@authored 16-2-2015
 *@finalized [in progress]
 */

//This will be SANIC_THE_HEHEHOG
public class Drivetrain extends Subsystem {
	//TODO: program Autonomous
	
    //Get all of the motors from RobotMap
	Talon leftSanic = RobotMap.leftDrive,
			rightSanic = RobotMap.rightDrive;

    public void initDefaultCommand() {
        setDefaultCommand(new GoFast());
    }
    
    public void goFast(double baseSpeed, double speed, double direction) {
    	leftSanic.set(baseSpeed*(speed-direction));
    	rightSanic.set(-baseSpeed*(speed-direction));
    }
    
    public void dontGo() {
    	leftSanic.set(0);
    	rightSanic.set(0);
    }
}

