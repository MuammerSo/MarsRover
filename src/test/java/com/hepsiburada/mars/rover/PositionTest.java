package com.hepsiburada.mars.rover;

import com.hepsiburada.mars.parser.InputParser;
import com.hepsiburada.mars.plateau.Plateau;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PositionTest {
    private Position position;

    @Before
    public void setUp(){
        position = InputParser.parsePosition("5 5 N");
    }

    @Test
    public void rotateRightTest(){
        assertEquals(Direction.EAST, position.rotateRight().getDirection());
    }

    @Test
    public void rotateLeftTest(){
        assertEquals(Direction.WEST, position.rotateLeft().getDirection());
    }

    @Test
    public void moveAheadTest(){
        assertEquals(5, position.moveAhead().getX());
        assertEquals(6, position.moveAhead().getY());
        assertEquals(Direction.NORTH, position.moveAhead().getDirection());
    }

    @Test
    public void isWithInTest(){
        assertTrue(position.isWithIn(7,7));
        assertFalse(position.isWithIn(1,1));
    }
}
