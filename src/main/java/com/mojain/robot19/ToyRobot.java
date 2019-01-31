package com.mojain.robot19;

import java.util.Scanner;

public class ToyRobot {

    public static void main(String[] args) {
        Parser parser = new Parser();
        Scanner in = new Scanner(System.in);
        Robot robot = new Robot(new Position(0, 0), Direction.NORTH);

        while (in.hasNext()) {
            String input = in.nextLine();
            Command command = parser.parse(input);
            robot = command.invoke(robot);
        }
    }
}
