package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Transport extends SubsystemBase {

    private double speed;
    private MotorController motorController;
    public Transport(MotorController motorController, double speed) {
        this.motorController=motorController;
        this.speed=speed;
    }

    public void moveTransport() {
        motorController.set(speed);
    }

    public void stopTransport() {
        motorController.stopMotor();
    }
    
    
}
