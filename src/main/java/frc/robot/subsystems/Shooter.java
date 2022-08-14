package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
    private MotorController shooterLeft, shooterRight;
    private double leftSpeed, rightSpeed;
    public Shooter(MotorController shooterLeft, MotorController shooterRight, double leftSpeed, double rightSpeed) {
        this.shooterLeft = shooterLeft;
        this.shooterRight = shooterRight;
        this.leftSpeed = leftSpeed;
        this.rightSpeed = rightSpeed;
    }

    public void moveShooter() {
        shooterLeft.set(leftSpeed);
        shooterRight.set(rightSpeed);
    }

    public void stopShooter() {
        shooterRight.stopMotor();
        shooterLeft.stopMotor();
    }
}
