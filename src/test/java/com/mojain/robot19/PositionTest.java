package com.mojain.robot19;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PositionTest {

    @Test
    public void shouldBeValueObjects() {
        Position a = new Position(1, 2);
        Position b = new Position(1, 2);
        assertEquals(a, b);
    }

    @Test
    public void hasStringRepresentation() {
        assertEquals("1,2", new Position(1, 2).toString());
    }
}