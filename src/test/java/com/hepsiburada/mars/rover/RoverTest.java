package com.hepsiburada.mars.rover;

import com.hepsiburada.mars.parser.InputParser;
import com.hepsiburada.mars.plateau.Plateau;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverTest {

    private Plateau plateau;
    private Position position;
    private Rover rover;

    @Before
    public void setUp(){
        plateau = InputParser.parsePlateau("5 5");
        position = InputParser.parsePosition("1 1 N");
        rover = new Rover(plateau,position);
    }

    @Test
    public void turnRightTest() {
        rover.process("R");
        assertEquals(1, rover.getPosition().getX());
        assertEquals(1, rover.getPosition().getY());
        assertEquals(Direction.EAST, rover.getPosition().getDirection());
    }

    @Test
    public void shouldTurnLeft() {
        rover.process("L");
        assertEquals(1, rover.getPosition().getX());
        assertEquals(1, rover.getPosition().getY());
        assertEquals(Direction.WEST, rover.getPosition().getDirection());
    }

    @Test
    public void shouldMoveForward() {
        rover.process("M");
        assertEquals(1, rover.getPosition().getX());
        assertEquals(2, rover.getPosition().getY());
        assertEquals(Direction.NORTH, rover.getPosition().getDirection());
    }

    @Test
    public void shouldNotChangeDirectionandPosition() {
        rover.process("LRLRLRLRLR");
        assertEquals(1, rover.getPosition().getX());
        assertEquals(1, rover.getPosition().getY());
        assertEquals(Direction.NORTH, rover.getPosition().getDirection());
    }

    @Test
    public void shouldNotCrossBoundryNorth() {
        rover.process("MMMMMMMMMM");
        assertEquals(1, rover.getPosition().getX());
        assertEquals(5, rover.getPosition().getY());
        assertEquals(Direction.NORTH, rover.getPosition().getDirection());
    }

    @Test
    public void shouldNotCrossBoundrySouth() {
        rover.process("LLMMMMMMMMM");
        assertEquals(1, rover.getPosition().getX());
        assertEquals(0, rover.getPosition().getY());
        assertEquals(Direction.SOUTH, rover.getPosition().getDirection());
    }

    @Test
    public void shouldNotCrossBoundryEast() {
        rover.process("RMMMMMMMMMM");
        assertEquals(5, rover.getPosition().getX());
        assertEquals(1, rover.getPosition().getY());
        assertEquals(Direction.EAST, rover.getPosition().getDirection());
    }

    @Test
    public void shouldNotCrossBoundryWest() {
        rover.process("LMMMMMMMMMM");
        assertEquals(0, rover.getPosition().getX());
        assertEquals(1, rover.getPosition().getY());
        assertEquals(Direction.WEST, rover.getPosition().getDirection());
    }
}
