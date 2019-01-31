package com.mojain.robot19;

import org.junit.Before;
import org.junit.Test;

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
}
