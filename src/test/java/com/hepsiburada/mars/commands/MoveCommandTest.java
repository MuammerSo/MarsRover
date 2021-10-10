package com.hepsiburada.mars.commands;

import com.hepsiburada.mars.parser.InputParser;
import com.hepsiburada.mars.plateau.Plateau;
import com.hepsiburada.mars.rover.Direction;
import com.hepsiburada.mars.rover.Position;
import com.hepsiburada.mars.rover.Rover;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoveCommandTest {

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
    public void moveCommandTest() {
        MoveCommand moveCommand  = new MoveCommand();
        moveCommand.processCommand(rover);

        assertEquals(1,rover.getPosition().getX());
        assertEquals(2,rover.getPosition().getY());
        assertEquals(Direction.NORTH,rover.getPosition().getDirection());
    }

}
