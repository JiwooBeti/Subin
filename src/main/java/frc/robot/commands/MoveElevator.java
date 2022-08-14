package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;

public class MoveElevator extends CommandBase {
    public MoveElevator() {
        addRequirements(RobotContainer.getElevator());
    }

    @Override
    public void initialize() {
        if(RobotContainer.getJoystick().getRawButton(Constants.ELEVATOR_UP_BUTTON)) {
            RobotContainer.getElevator().moveUp();
        } else if(RobotContainer.getJoystick().getRawButton(Constants.ELEVATOR_DOWN_BUTTON)) {
            RobotContainer.getElevator().moveDown();
        }
    }

    @Override
    public void execute() {
        if(RobotContainer.getJoystick().getRawButton(Constants.ELEVATOR_UP_BUTTON)) {
            RobotContainer.getElevator().moveUp();
        } else if(RobotContainer.getJoystick().getRawButton(Constants.ELEVATOR_DOWN_BUTTON)) {
            RobotContainer.getElevator().moveDown();
        }
    }

    @Override
    public boolean isFinished() {
        return !RobotContainer.getJoystick().getRawButton(Constants.ELEVATOR_DOWN_BUTTON) || !RobotContainer.getJoystick().getRawButton(Constants.ELEVATOR_UP_BUTTON);

    }

    @Override
    public void end(boolean interrupted) {
        RobotContainer.getElevator().stop();

    }

    
}
