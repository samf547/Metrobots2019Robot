package frc.team3324.robot.climber.commands.teleop;

import frc.team3324.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * Command class to push down the climber.
 */
public class PushDown extends Command {

    private boolean gearClimberStatus = false;

    public PushDown() { super("PushDown"); }

    protected void initialize() {}

    protected void execute() { Robot.climber.pushDown(); }

    @Override
    protected boolean isFinished() {
        return true;
    }
}
