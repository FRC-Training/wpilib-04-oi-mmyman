/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;


import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class MySubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private TalonSRX motor1;
  private TalonSRX motor2;
  private TalonSRX motor3;
  private TalonSRX motor4;
  public MySubsystem ()
  {
    motor1 = new TalonSRX(RobotMap.motor1CanID);
    motor2 = new TalonSRX(RobotMap.motor2CanID);
    motor3 = new TalonSRX(RobotMap.motor3CanID);
    motor4 = new TalonSRX(RobotMap.motor4CanID);
  }

  
  public void runSetSpeed(double speedLeft, double speedRight)
  {
    motor1.set(ControlMode.PercentOutput, speedLeft);
    /*
    motor2.set(ControlMode.PercentOutput, speedLeft);
    motor3.set(ControlMode.PercentOutput, speedRight);
    motor4.set(ControlMode.PercentOutput, speedRight);
    */
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
