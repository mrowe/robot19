package com.mojain.robot19.commands;

import com.mojain.robot19.Command;
import com.mojain.robot19.Robot;

public class ReportCommand implements Command {
    @Override
    public Robot invoke(Robot robot) {
        System.out.println(String.format("%s,%s", robot.position, robot.facing));
        return robot;
    }
}
