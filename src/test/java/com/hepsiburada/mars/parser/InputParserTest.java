package com.hepsiburada.mars.parser;

import com.hepsiburada.mars.plateau.Plateau;
import com.hepsiburada.mars.rover.Direction;
import com.hepsiburada.mars.rover.Position;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InputParserTest {

    @Test
    public void testParseGrid() {
        String input = "1 2";
        Plateau plateau = InputParser.parsePlateau(input);
        assertEquals(1, plateau.getX());
        assertEquals(2, plateau.getY());
    }

    @Test
    public void testParsePosition() {
        String input = "1 1 N";
        Position position = InputParser.parsePosition(input);
        assertEquals(1, position.getX());
        assertEquals(1, position.getY());
        assertEquals(Direction.NORTH, position.getDirection());
    }

}
