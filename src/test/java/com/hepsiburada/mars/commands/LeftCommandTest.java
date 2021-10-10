package com.hepsiburada.mars.commands;

import com.hepsiburada.mars.parser.InputParser;
import com.hepsiburada.mars.plateau.Plateau;
import com.hepsiburada.mars.rover.Direction;
import com.hepsiburada.mars.rover.Position;
import com.hepsiburada.mars.rover.Rover;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeftCommandTest {

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
    public void leftCommandTest() {

        LeftCommand leftCommand  = new LeftCommand();
        leftCommand.processCommand(rover);

        assertEquals(1,rover.getPosition().getX());
        assertEquals(1,rover.getPosition().getY());
        assertEquals(Direction.WEST,rover.getPosition().getDirection());
    }

}
