package frc.robot.subsystems;


//import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConst;

public class Drivetrain extends SubsystemBase{

    private final PWMVictorSPX frontleft = new PWMVictorSPX(DriveConst.FRONTLEFT);
    private final PWMVictorSPX backright = new PWMVictorSPX(DriveConst.BACKRIGHT);
    private final PWMVictorSPX backleft = new PWMVictorSPX(DriveConst.BACKLEFT);
    private final PWMVictorSPX frontright = new PWMVictorSPX(DriveConst.FRONTRIGHT);

    //frontRightSC = new SpeedController(frontright);
    //frontLeftSC = new SpeedController(backright);
    //backRightSC = new SpeedController(backleft);
    //backLeftSC = new SpeedController(frontright);
    

    /**
    private final CANSparkMax frontright = new CANSparkMax(DriveConst.FRONTRIGHT, MotorType.kBrushless);
    private final CANSparkMax frontleft = new CANSparkMax(DriveConst.FRONTLEFT, MotorType.kBrushless);
    private final CANSparkMax backleft = new CANSparkMax(DriveConst.BACKLEFT, MotorType.kBrushless);
    private final CANSparkMax backright = new CANSparkMax(DriveConst.BACKRIGHT, MotorType.kBrushless);
    */

    /** 
    private final VictorSPX frontright = new VictorSPX(DriveConst.FRONTRIGHT);
    private final VictorSPX frontleft = new VictorSPX(DriveConst.FRONTLEFT);
    private final VictorSPX backright = new VictorSPX(DriveConst.BACKRIGHT);
    private final VictorSPX backleft = new VictorSPX(DriveConst.BACKLEFT);
    */
    public final MecanumDrive drivetrain = new MecanumDrive(frontright, frontleft, backleft, backright);

    public void drive(double xspeed, double yspeed, double rot, boolean fieldRelative){
        drivetrain.driveCartesian(xspeed, yspeed, rot);
    }

    public void setMaxOutput(double maxOutput){
        drivetrain.setMaxOutput(maxOutput);
    }
}