// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    //-------Ports---------
    public static final int DRIVETRAIN_LEFT_UP = -1;
    public static final int DRIVETRAIN_LEFT_DOWN = -1;
    public static final int DRIVETRAIN_RIGHT_UP = -1;
    public static final int DRIVETRAIN_RIGHT_DOWN = -1;
    public static final int INTAKE_PORT = -1; 
    public static final int TRANSPORT_PORT = -1;
    public static final int SHOOTER_LEFT_PORT = -1;
    public static final int SHOOTER_RIGHT_PORT = -1;
    public static final int ELEVATOR_PORT = -1;

    public static final int TILT_COMPRESSOR_ONE = -1;
    public static final int TILT_COMPRESSOR_TWO = -1;
    public static final int TILT_SOLENOID_ONE = -1;
    public static final int TILT_SOLENOID_TWO = -1;
    public static final int TILT_SOLENOID_ONE_CHANNEL = -1;
    public static final int TILT_SOLENOID_TWO_CHANNEL = -1;

    public static final int ARM_COMPRESSOR_ONE = -1;
    public static final int ARM_COMPRESSOR_TWO = -1;
    public static final int ARM_SOLENOID_ONE = -1;
    public static final int ARM_SOLENOID_TWO = -1;
    public static final int ARM_SOLENOID_ONE_CHANNEL = -1;
    public static final int ARM_SOLENOID_TWO_CHANNEL = -1;
    public static final int ARM_LEFT = -1;
    public static final int ARM_RIGHT = -1;






    //-----Speed------------
    public static final double INTAKE_SPEED = 0.5;
    public static final double TRANSPORT_SPEED = 0.5;
    public static final double SHOOTER_LEFT_SPEED = 0.5;
    public static final double SHOOTER_RIGHT_SPEED = 0.5;
    public static final double ELEVATOR_SPEED = 0.5;
    public static final double ARM_SPEED = 0.5;



    //-----Button-----------
    public static final int INTAKE_BUTTON = -1;
    public static final int TRANSPORT_BUTTON = -1;
    public static final int SHOOTER_BUTTON = -1;
    public static final int ELEVATOR_UP_BUTTON = -1;
    public static final int ELEVATOR_DOWN_BUTTON = -1;
    public static final int INTAKE_TILT_BUTTON = -1;

    public static final int ARM_UP_BUTTON = -1;
    public static final int ARM_DOWN_BUTTON = -1;
    public static final int ARM_TILT_BUTTON = -1;
}
