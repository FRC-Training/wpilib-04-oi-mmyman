/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import frc.robot.RobotMap;

/**
 * MySubsystem with 1 TalonSRX motor controller
 */
public class MySubsystem extends Subsystem {
  //Declare Components
  private TalonSRX motor;

  //Initialize Components
  public MySubsystem() {
    motor = new TalonSRX(RobotMap.motorCanID);
  }

  //Run the motor at speed
  public void runMotor(double speed) {
    motor.set(ControlMode.PercentOutput, speed);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
