package frc.team3324.robot.arm.commands;

import edu.wpi.first.wpilibj.command.PIDCommand;
import frc.team3324.robot.Robot;

public class OneThirtyFIveDegree extends PIDCommand{

    private double goal = (Math.PI*3)/4;

    public OneThirtyFIveDegree() {
        super(0, 0, 0, 0.02);
        requires(Robot.arm);
    }

    @Override
    protected void initialize() {
        super.setSetpoint(goal);
    }

    @Override
    protected boolean isFinished() {
        return (goal == getPosition());
    }

    @Override
    protected double returnPIDInput() {
        return Robot.arm.getArmRadians();
    }


    @Override
    protected void usePIDOutput(double output) {
        Robot.arm.setArmSpeed(output);
    }
}

