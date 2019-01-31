package com.mojain.robot19.commands;

import com.mojain.robot19.Command;
import com.mojain.robot19.Robot;

public class LeftCommand implements Command {
    @Override
    public Robot invoke(Robot robot) {
        return new Robot(robot.position, robot.facing.left());
    }
}
