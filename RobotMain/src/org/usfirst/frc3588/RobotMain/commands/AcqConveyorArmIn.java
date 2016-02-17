// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc3588.RobotMain.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc3588.RobotMain.Robot;
import org.usfirst.frc3588.RobotMain.RobotMap;

/**
 *
 */
public class AcqConveyorArmIn extends Command {

	private double conveyer;

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

	// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
	public AcqConveyorArmIn() {

		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.acq);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		conveyer = -(SmartDashboard.getNumber("DB/Slider 2", 0.0) / 5);
		if (conveyer < 0.1 && conveyer > -0.1) {
			conveyer = -0.6;
			RobotMap.acqConveyorArm.set(-0.6);
		}
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {

		RobotMap.acqConveyorArm.set(conveyer);

	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
/*		if (RobotMap.acqLineBreakSensor.get()) {
			return false;
		} else {
			return true;
		}*/
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {
		RobotMap.acqConveyorArm.set(0);
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		end();
	}
}
