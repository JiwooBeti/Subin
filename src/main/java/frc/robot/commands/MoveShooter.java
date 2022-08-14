package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;

public class MoveShooter extends CommandBase {
    public MoveShooter() {
        addRequirements(RobotContainer.getShooter());
    }

    @Override
    public void initialize() {
        RobotContainer.getShooter().moveShooter();
    }

    @Override
    public void execute() {
        RobotContainer.getShooter().moveShooter();
    }

    @Override
    public boolean isFinished() {
        return !RobotContainer.getJoystick().getRawButton(Constants.SHOOTER_BUTTON);
    }

    @Override
    public void end(boolean interrupted) {
        RobotContainer.getShooter().stopShooter();
    }
    
}
