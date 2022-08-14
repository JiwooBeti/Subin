package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;

public class MoveArm extends CommandBase {
    public MoveArm() {
        addRequirements(RobotContainer.getArm());
    }

    @Override
    public void initialize() {
        RobotContainer.getArm().moveArm();
    }

    @Override
    public void execute() {
        RobotContainer.getArm().moveArm();        
    }

    @Override
    public boolean isFinished() {
        return !RobotContainer.getJoystick().getRawButton(Constants.ARM_UP_BUTTON) || !RobotContainer.getJoystick().getRawButton(Constants.ARM_DOWN_BUTTON);
    }

    @Override
    public void end(boolean interrupted) {
        RobotContainer.getArm().stopArm();
    }



    
}
