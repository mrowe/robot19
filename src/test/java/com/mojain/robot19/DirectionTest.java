package com.mojain.robot19;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectionTest {

    @Test
    public void right() {
        assertEquals(Direction.WEST, Direction.SOUTH.right());
        assertEquals(Direction.SOUTH, Direction.EAST.right());
        assertEquals(Direction.EAST, Direction.NORTH.right());
        assertEquals(Direction.NORTH, Direction.WEST.right());
    }

    @Test
    public void left() {
        assertEquals(Direction.WEST, Direction.NORTH.left());
        assertEquals(Direction.SOUTH, Direction.WEST.left());
        assertEquals(Direction.EAST, Direction.SOUTH.left());
        assertEquals(Direction.NORTH, Direction.EAST.left());
    }
}