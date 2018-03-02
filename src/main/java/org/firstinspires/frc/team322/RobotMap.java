// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.firstinspires.frc.team322;

import com.ctre.phoenix.CANifier;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.Sendable;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import com.analog.adis16448.frc.ADIS16448_IMU;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static WPI_TalonSRX chassisleftFrontDriveMotor;
    public static WPI_TalonSRX chassisleftRearDriveMotor;
    public static SpeedControllerGroup chassisleftSideDriveMotors;
    public static WPI_TalonSRX chassisrightFrontDriveMotor;
    public static WPI_TalonSRX chassisrightRearDriveMotor;
    public static SpeedControllerGroup chassisrightSideDriveMotors;
    public static DifferentialDrive chassisrobotDrive;
    public static PowerDistributionPanel chassisSensorspowerDistributionPanel;
    public static WPI_TalonSRX lowerArmleftLowerArmMotor;
    public static WPI_TalonSRX lowerArmrightLowerArmMotor;
    public static SpeedControllerGroup lowerArmlowerArmMotors;
    public static WPI_TalonSRX endArmendArmLeftWheel;
    public static WPI_TalonSRX endArmendArmRightWheel;
    public static SpeedControllerGroup endArmendArmMotors;
    public static WPI_TalonSRX climbArmwinch;
    
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static CANifier ledControlCANifier;
    public static DoubleSolenoid climbArmdoubleSolenoid1;
    public static ADIS16448_IMU chassisSensorsIMU;
    
	private static final double WHEEL_DIAMETER = 6.0;
	private static final double CYCLES_PER_REVOLUTION = 360.0;
	private static final double ENCODER_GEAR_RATIO = 1.0;
	private static final double GEAR_RATIO = 1.0;
	private static final double FUDGE_FACTOR = 1.0;
	public static final double ENCODER_PULSE_DISTANCE = 
			Math.PI * WHEEL_DIAMETER / CYCLES_PER_REVOLUTION / ENCODER_GEAR_RATIO / GEAR_RATIO * FUDGE_FACTOR;
    
    public static double redInt, greenInt, blueInt;
    public static long ledBlinkRate;
    
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        chassisleftFrontDriveMotor = new WPI_TalonSRX(1);
        chassisleftRearDriveMotor = new WPI_TalonSRX(2);
        
        chassisleftSideDriveMotors = new SpeedControllerGroup(chassisleftFrontDriveMotor, chassisleftRearDriveMotor  );
        chassisleftSideDriveMotors.setName("Chassis", "leftSifeDriveMotors");
        chassisleftSideDriveMotors.setInverted(true);
        
        chassisrightFrontDriveMotor = new WPI_TalonSRX(3);
        chassisrightRearDriveMotor = new WPI_TalonSRX(4);
                
        chassisrightSideDriveMotors = new SpeedControllerGroup(chassisrightFrontDriveMotor, chassisrightRearDriveMotor  );
        chassisrightSideDriveMotors.setName("Chassis", "rightSideDriveMotors");
        chassisrightSideDriveMotors.setInverted(false);
        
        chassisrobotDrive = new DifferentialDrive(chassisleftSideDriveMotors, chassisrightSideDriveMotors);
        chassisrobotDrive.setName("Chassis", "robotDrive");
        chassisrobotDrive.setSafetyEnabled(true);
        chassisrobotDrive.setExpiration(0.1);
        chassisrobotDrive.setMaxOutput(1.0);

        
        chassisSensorspowerDistributionPanel = new PowerDistributionPanel(0);
        chassisSensorspowerDistributionPanel.setName("ChassisSensors", "powerDistributionPanel");
        
        
        lowerArmleftLowerArmMotor = new WPI_TalonSRX(5);
        lowerArmrightLowerArmMotor = new WPI_TalonSRX(6);
        
        lowerArmlowerArmMotors = new SpeedControllerGroup(lowerArmleftLowerArmMotor, lowerArmrightLowerArmMotor  );
        lowerArmlowerArmMotors.setName("LowerArm", "lowerArmMotors");
        
        
        endArmendArmLeftWheel = new WPI_TalonSRX(7);
        endArmendArmRightWheel = new WPI_TalonSRX(8);
        
        endArmendArmMotors = new SpeedControllerGroup(endArmendArmLeftWheel, endArmendArmRightWheel  );
        endArmendArmMotors.setName("EndArm", "endArmMotors");
        
        climbArmwinch = new WPI_TalonSRX(9);        
        climbArmwinch.setName("ClimbArm", "climbArmWinch");
        
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
        ledControlCANifier = new CANifier(0);
        
        climbArmdoubleSolenoid1 = new DoubleSolenoid(0, 0, 1);
        climbArmdoubleSolenoid1.setName("ClimbArm", "doubleSolenoid1");
        
        chassisSensorsIMU = new ADIS16448_IMU();
        chassisSensorsIMU.setName("ChassisSensors", "IMU");
        chassisSensorsIMU.calibrate();
        
        redInt = 100.0;
        greenInt = 100.0;
        blueInt = 100.0;
        ledBlinkRate = 500;
    }
}
