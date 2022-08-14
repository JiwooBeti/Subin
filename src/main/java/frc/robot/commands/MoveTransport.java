package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;

public class MoveTransport extends CommandBase {

    public MoveTransport() {
        addRequirements(RobotContainer.getTransport());
    }

    @Override
    public void initialize() {
        RobotContainer.getTransport().moveTransport();
    }

    @Override
    public void execute() {
        RobotContainer.getTransport().moveTransport();;

    }

    @Override
    public boolean isFinished() {
        return !RobotContainer.getJoystick().getRawButton(Constants.TRANSPORT_BUTTON);
    }

    @Override
    public void end(boolean interrupted) {
        RobotContainer.getTransport().stopTransport();
    }

    
}
