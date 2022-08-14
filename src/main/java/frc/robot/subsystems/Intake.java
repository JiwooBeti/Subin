package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase{
    private double speed;
    private MotorController motorController;
    public Intake(MotorController motorController, double speed) {
        this.motorController=motorController;
        this.speed=speed;
    }

    public void moveIntake() {
        motorController.set(speed);
    }

    public void stopIntake() {
        motorController.stopMotor();
    }
    
}
