package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;

public class ToggleTiltArm extends CommandBase{
    public ToggleTiltArm() {
        addRequirements(RobotContainer.getArm());
    }

    @Override
    public void initialize() {
        RobotContainer.getArm().toggleTiltArm();
    }

    @Override
    public void execute() {
        RobotContainer.getIntake().moveIntake();
        RobotContainer.getArm().toggleTiltArm();
    }

    @Override
    public boolean isFinished() {
        return !RobotContainer.getJoystick().getRawButton(Constants.ARM_TILT_BUTTON);
    }

    @Override
    public void end(boolean interrupted) {

    }
}
