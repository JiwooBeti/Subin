package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Elevator extends SubsystemBase {
    private MotorController motorController;
    private double speed;

    public Elevator(MotorController motorController, double speed) {
        this.motorController=motorController;
        this.speed=speed;
    }

    public void moveUp() {
        motorController.set(speed);
    }

    public void moveDown() {
        motorController.set(-1*speed);
    }

    public void stop() {
        motorController.stopMotor();
    }
    
}
