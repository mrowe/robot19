package com.mojain.robot19.commands;

import com.mojain.robot19.Command;
import com.mojain.robot19.Direction;
import com.mojain.robot19.Robot;

public class RightCommand implements Command {
    @Override
    public Robot invoke(Robot robot) {
        int n = robot.facing.ordinal() + 1;
        if (n > Direction.values().length) n -= Direction.values().length;

        return new Robot(robot.position, Direction.values()[n]);
    }
}
