package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;

public class Arm extends SubsystemBase {
    private MotorController left, right;
    private Solenoid solenoidLeft, solenoidRight;
    private double speed;

    public Arm(MotorController left, MotorController right, Solenoid l, Solenoid r, double speed) {
        this.left = left;
        this.right = right;
        this.solenoidLeft = l;
        this.solenoidRight = r;
        this.speed = speed;
    }

    public void moveArm() {
        if(RobotContainer.getJoystick().getRawButton(Constants.ARM_UP_BUTTON)) {
            left.set(speed);
            right.set(speed);
        } else {
            left.set(speed*-1);
            right.set(speed*-1);
        }
    }

    public void stopArm() {
        left.stopMotor();
        right.stopMotor();
    }

    public void toggleTiltArm() {
        solenoidLeft.toggle();
        solenoidRight.toggle();
    }
    
}
