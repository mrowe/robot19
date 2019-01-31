package com.mojain.robot19;

import com.mojain.robot19.commands.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ParserTest {

    private Parser parser;

    @Before
    public void setUp() {
        parser = new Parser();
    }

    @Test
    public void shouldParseMoveCommand() {
        assertTrue(parser.parse("MOVE") instanceof MoveCommand);
    }

    @Test
    public void shouldParseLeftCommand() {
        assertTrue(parser.parse("LEFT") instanceof LeftCommand);
    }

    @Test
    public void shouldParseRightCommand() {
        assertTrue(parser.parse("RIGHT") instanceof RightCommand);
    }

    @Test
    public void shouldParseReportCommand() {
        assertTrue(parser.parse("REPORT") instanceof ReportCommand);
    }

    @Test
    public void shouldParsePlaceCommand() {
        Command actual = parser.parse("PLACE 0,0,NORTH");
        assertTrue(actual instanceof PlaceCommand);
        Robot robot = actual.invoke(new Robot(new Position(1, 2), Direction.EAST));
        assertEquals(robot.position, new Position(0, 0));
        assertEquals(robot.facing, Direction.NORTH);
    }

}
