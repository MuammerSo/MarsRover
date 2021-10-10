package com.hepsiburada.mars.rover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectionTest {


    @Test
    public void shouldReturnLeft() {
        assertEquals(Direction.EAST, Direction.SOUTH.left());
        assertEquals(Direction.WEST, Direction.NORTH.left());
        assertEquals(Direction.NORTH, Direction.EAST.left());
        assertEquals(Direction.SOUTH, Direction.WEST.left());

    }

    @Test
    public void shouldReturnRight() {
        assertEquals(Direction.WEST, Direction.SOUTH.right());
        assertEquals(Direction.EAST, Direction.NORTH.right());
        assertEquals(Direction.SOUTH, Direction.EAST.right());
        assertEquals(Direction.NORTH, Direction.WEST.right());
    }
}
