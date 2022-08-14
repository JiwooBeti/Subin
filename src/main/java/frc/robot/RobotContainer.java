// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import frc.robot.commands.DriveWithJoystick;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.MoveElevator;
import frc.robot.commands.MoveIntake;
import frc.robot.commands.MoveShooter;
import frc.robot.commands.MoveTransport;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Elevator;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Shooter;
import frc.robot.subsystems.Transport;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();

  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);

  //-------------Drive Train-----------
  private static MotorController leftUp, leftDown, rightUp, rightDown;
  private static MotorControllerGroup left, right;
  private static DifferentialDrive drive;
  private static DriveTrain driveTrain;
  private static Joystick joy = new Joystick(0);


  //------------Intake------------
  private static MotorController intakeController;
  private static Button intakeButton;
  private static Intake intake;

    //------------Tranposrt------------
  private static MotorController transportController;
  private static Button transportButton;
  private static Transport transport;

  //-----------------Shooter-------------
  private static MotorController shooterLeftController, shooterRightController;
  private static Button shooterButton;
  private static Shooter shooter;

  //----------------Elevator------------
  private static MotorController elevatorController;
  private static Button elevatorUpButton, elevatorDownButton;
  private static Elevator elevator;


  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    //--------Drive Train--------------
    leftUp = new CANSparkMax(0, MotorType.kBrushed);
    leftDown = new CANSparkMax(0, MotorType.kBrushed);
    rightUp = new CANSparkMax(0, MotorType.kBrushed);
    rightDown = new CANSparkMax(0, MotorType.kBrushed);
    left = new MotorControllerGroup(leftUp, leftDown);
    right = new MotorControllerGroup(rightUp, rightDown);
    drive = new DifferentialDrive(left, right);
    driveTrain = new DriveTrain(left, right, drive);
    driveTrain.setDefaultCommand(new DriveWithJoystick());

    //---------Intake------------
    intakeController = new WPI_VictorSPX(Constants.INTAKE_PORT);
    intake = new Intake(intakeController, Constants.INTAKE_SPEED);

    //----------Transport-------------
    transportController = new WPI_VictorSPX(Constants.TRANSPORT_PORT);
    transport = new Transport(transportController, Constants.TRANSPORT_SPEED);

    //----------Shooter----------------
    shooterLeftController = new CANSparkMax(Constants.SHOOTER_LEFT_PORT, MotorType.kBrushed);
    shooterRightController = new CANSparkMax(Constants.SHOOTER_RIGHT_PORT, MotorType.kBrushed);
    shooter = new Shooter(shooterLeftController, shooterRightController, Constants.SHOOTER_LEFT_SPEED, Constants.SHOOTER_RIGHT_SPEED);

    //----------Elevator--------------
    elevatorController = new WPI_VictorSPX(Constants.ELEVATOR_PORT);
    elevator = new Elevator(elevatorController, Constants.ELEVATOR_SPEED);


    
    





    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    intakeButton = new JoystickButton(joy, Constants.INTAKE_BUTTON);
    intakeButton.whileHeld(new MoveIntake());

    transportButton = new JoystickButton(joy, Constants.TRANSPORT_BUTTON);
    transportButton.whileHeld(new MoveTransport());

    shooterButton = new JoystickButton(joy, Constants.SHOOTER_BUTTON);
    shooterButton.whileHeld(new MoveShooter());

    elevatorUpButton = new JoystickButton(joy, Constants.ELEVATOR_UP_BUTTON);
    elevatorDownButton = new JoystickButton(joy,Constants.ELEVATOR_DOWN_BUTTON);
    elevatorUpButton.whileHeld(new MoveElevator());
    elevatorDownButton.whileHeld(new MoveElevator());
    
    
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }

  public static DriveTrain getDriveTrain() {return driveTrain;}
  public static Joystick getJoystick() {return joy;}
  public static Intake getIntake() {return intake;}
  public static Transport getTransport() {return transport;}
  public static Shooter getShooter() {return shooter;}
  public static Elevator getElevator() {return elevator;}
  
}
