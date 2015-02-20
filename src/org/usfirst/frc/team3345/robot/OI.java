package org.usfirst.frc.team3345.robot;

import org.usfirst.frc.team3345.robot.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.buttons.Trigger;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
	
	//Initialize both joysticks
	public static Joystick leftStick = new Joystick(0),
			rightStick = new Joystick(1);
	
	//Initialize the left joystick buttons
		//TODO: figure out POV
		Button leftTrigger = new JoystickButton(leftStick, 1),
				leftThumb = new JoystickButton(leftStick, 2),
				leftUpLeft = new JoystickButton(leftStick, 5),
				leftDownLeft = new JoystickButton(leftStick, 3),
				leftUpRight = new JoystickButton(leftStick, 6),
				leftDownRight = new JoystickButton(leftStick, 4),
				leftPadOne = new JoystickButton(leftStick, 7),
				leftPadTwo = new JoystickButton(leftStick, 8),
				leftPadThree = new JoystickButton(leftStick, 9),
				leftPadFour = new JoystickButton(leftStick, 10),
				leftPadFive = new JoystickButton(leftStick, 11),
				leftPadSix = new JoystickButton(leftStick, 12);
		
		//Initialize the right joystick buttons
		//TODO: figure out POV
		Button rightTrigger = new JoystickButton(rightStick, 1),
				rightThumb = new JoystickButton(rightStick, 2),
				rightUpLeft = new JoystickButton(rightStick, 5),
				rightDownLeft = new JoystickButton(rightStick, 3),
				rightUpRight = new JoystickButton(rightStick, 6),
				rightDownRight = new JoystickButton(rightStick, 4),
				rightPadOne = new JoystickButton(rightStick, 7),
				rightPadTwo = new JoystickButton(rightStick, 8),
				rightPadThree = new JoystickButton(rightStick, 9),
				rightPadFour = new JoystickButton(rightStick, 10),
				rightPadFive = new JoystickButton(rightStick, 11),
				rightPadSix = new JoystickButton(rightStick, 12);
		
			
		/*
         * TODO: Reference http://team2168.org/javadoc/ and https://wpilib.screenstepslive.com/s/4485/m/13809 and
         * https://wpilib.screenstepslive.com/s/4485/m/13809/l/241906-converting-a-simple-autonomous-program-to-a-command-based-autonomous-program
         * for Trigger (custom input?) detection.
         */
        //Trigger test = new Trigger(0);
		

    public OI() {
        rightDownLeft.whileHeld(new DoodleyDooo());
        rightDownRight.whileHeld(new DoodleyUndooo());
        while(rightStick.getPOV() == 270) {
            new Baisser();
        }
        while(rightStick.getPOV() == 90) {
            new Soulever();
        }
        //rightStick.whilePressed
    }
}

