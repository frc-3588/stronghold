// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3588.RobotMain;

import org.usfirst.frc3588.RobotMain.commands.AcqArmDown;
import org.usfirst.frc3588.RobotMain.commands.AcqArmUp;
import org.usfirst.frc3588.RobotMain.commands.AcqConveyorArmIn;
import org.usfirst.frc3588.RobotMain.commands.AcqConveyorArmOut;
import org.usfirst.frc3588.RobotMain.commands.AutoForward;
import org.usfirst.frc3588.RobotMain.commands.AutoMot;
import org.usfirst.frc3588.RobotMain.commands.AutoRockWall;
import org.usfirst.frc3588.RobotMain.commands.AutonomousCommand;
import org.usfirst.frc3588.RobotMain.commands.Climb;
import org.usfirst.frc3588.RobotMain.commands.DefenseDown;
import org.usfirst.frc3588.RobotMain.commands.DefenseUp;
import org.usfirst.frc3588.RobotMain.commands.DriveCommand;
import org.usfirst.frc3588.RobotMain.commands.ShootTheBall;
import org.usfirst.frc3588.RobotMain.commands.ShootingLaunch;
import org.usfirst.frc3588.RobotMain.commands.ShootingPrepare;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


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


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton shootingPrepareButton;
    public JoystickButton shootingLaunchButton;
    public Joystick joystickRight;
    public Joystick joystickLeft;
    public JoystickButton acqConveyorArmInButton;
    public JoystickButton climbButton;
    public JoystickButton acqarmupbutton;
    public JoystickButton acqarmdownbutton;
    public Joystick controller;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        controller = new Joystick(2);
        
        acqarmdownbutton = new JoystickButton(controller, 8);
        acqarmdownbutton.whileHeld(new AcqArmDown());
        acqarmupbutton = new JoystickButton(controller, 7);
        acqarmupbutton.whileHeld(new AcqArmUp());
        climbButton = new JoystickButton(controller, 1);
        climbButton.whileHeld(new Climb());
        acqConveyorArmInButton = new JoystickButton(controller, 2);
        acqConveyorArmInButton.whileHeld(new AcqConveyorArmIn());
        joystickLeft = new Joystick(1);
        
        joystickRight = new Joystick(0);
        
        shootingLaunchButton = new JoystickButton(joystickRight, 2);
        shootingLaunchButton.whileHeld(new ShootingLaunch());
        shootingPrepareButton = new JoystickButton(joystickRight, 1);
        shootingPrepareButton.whileHeld(new ShootingPrepare());


        // SmartDashboard Buttons
        SmartDashboard.putData("AutonomousCommand", new AutonomousCommand());
        SmartDashboard.putData("AutoForward", new AutoForward());
        SmartDashboard.putData("AutoMot", new AutoMot());
        SmartDashboard.putData("AutoRockWall", new AutoRockWall());
        SmartDashboard.putData("DriveCommand", new DriveCommand());
        SmartDashboard.putData("AcqArmUp", new AcqArmUp());
        SmartDashboard.putData("AcqArmDown", new AcqArmDown());
        SmartDashboard.putData("AcqConveyorArmIn", new AcqConveyorArmIn());
        SmartDashboard.putData("AcqConveyorArmOut", new AcqConveyorArmOut());
        SmartDashboard.putData("ShootingLaunch", new ShootingLaunch());
        SmartDashboard.putData("Climb", new Climb());
        SmartDashboard.putData("DefenseUp", new DefenseUp());
        SmartDashboard.putData("DefenseDown", new DefenseDown());
        SmartDashboard.putData("ShootingPrepare", new ShootingPrepare());
        SmartDashboard.putData("ShootTheBall", new ShootTheBall());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getJoystickRight() {
        return joystickRight;
    }

    public Joystick getJoystickLeft() {
        return joystickLeft;
    }

    public Joystick getController() {
        return controller;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

