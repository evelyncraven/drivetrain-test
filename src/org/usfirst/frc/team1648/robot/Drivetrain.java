package org.usfirst.frc.team1648.robot;
//Imports the other files needed by the program
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class Drivetrain extends IterativeRobot {
	
	Victor frontLeft, frontRight, rearLeft, rearRight;
	Joystick left, right, stick;
	Timer timer;
	RobotDrive drive;
	
//Initializes the variables in the robotInit method, this method is called when the robot is initializing
	public void robotInit() {
		stick = new Joystick(1);
		timer = new Timer();
		frontLeft = new Victor(1);
		frontRight = new Victor(2);
		rearLeft = new Victor (3);
		rearRight = new Victor (4);
		drive = new RobotDrive(frontLeft, rearLeft, frontRight, rearRight);
    }
    
  //The teleopInit method is called once each time the robot enters teleop mode
    public void teleopInit() {
    	
	}
    
    public void operatorControl() {
    	while (isOperatorControl() && isEnabled()) {
    	drive.tankDrive(left, right);
    	Timer.delay(0.01);
    	}
    }
}
