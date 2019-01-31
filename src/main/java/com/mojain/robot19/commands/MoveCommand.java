package com.mojain.robot19.commands;

import com.mojain.robot19.Command;
import com.mojain.robot19.Position;
import com.mojain.robot19.Robot;

public class MoveCommand implements Command {
    @Override
    public Robot invoke(Robot robot) {
        Position potentialPos;
        switch (robot.facing) {
            case NORTH:
                potentialPos = new Position(robot.position.x, robot.position.y + 1);
                break;
            case SOUTH:
                potentialPos = new Position(robot.position.x, robot.position.y - 1);
                break;
            case EAST:
                potentialPos = new Position(robot.position.x + 1, robot.position.y);
                break;
            case WEST:
                potentialPos = new Position(robot.position.x - 1, robot.position.y);
                break;
            default:
                potentialPos = robot.position;
        }
        return new Robot(potentialPos, robot.facing);
    }
}
