package com.mojain.robot19;

import com.mojain.robot19.commands.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommandsTest {

    private Robot robot;

    @Before
    public void setUp() throws Exception {
        robot = new Robot(new Position(0, 0), Direction.NORTH);
    }

    @Test
    public void placeCommandShouldPlaceRobot() {
        Robot actual = new PlaceCommand(1, 2, Direction.SOUTH).invoke(robot);
        assertEquals(Direction.SOUTH, actual.facing);
        assertEquals(new Position(1, 2), actual.position);
    }

    @Test
    public void leftCommandShouldTurnRobot() {
        Robot actual = new LeftCommand().invoke(robot);
        assertEquals(Direction.WEST, actual.facing);
    }

    @Test
    public void rightCommandShouldTurnRobot() {
        Robot actual = new RightCommand().invoke(robot);
        assertEquals(Direction.EAST, actual.facing);
    }

    @Test
    public void moveCommandShouldMoveRobot() {
        Robot actual = new MoveCommand().invoke(robot);
        assertEquals(new Position(0, 1), actual.position);
    }
}