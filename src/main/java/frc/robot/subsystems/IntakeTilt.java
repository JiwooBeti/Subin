package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeTilt extends SubsystemBase {
    private Solenoid solenoidOne, solenoidTwo;
    public IntakeTilt(Solenoid solenoidOne, Solenoid solenoidTwo) {
        this.solenoidOne = solenoidOne;
        this.solenoidTwo = solenoidTwo;
    }    

    public void toggleIntake() {
        solenoidOne.toggle();
        solenoidTwo.toggle();
    }
    
}
