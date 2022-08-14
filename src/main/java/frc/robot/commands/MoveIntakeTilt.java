package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;

public class MoveIntakeTilt extends CommandBase {
    public MoveIntakeTilt() {
        addRequirements(RobotContainer.getIntakeTilt());
    }

    @Override
    public void initialize() {
        RobotContainer.getIntakeTilt().toggleIntake();
    }

    @Override
    public void execute() {
        RobotContainer.getIntakeTilt().toggleIntake();
    }

    @Override
    public boolean isFinished() {
        return !RobotContainer.getJoystick().getRawButton(Constants.INTAKE_TILT_BUTTON);
    }

    @Override
    public void end(boolean interrupted) {
    }


}
