package com.hepsiburada.mars.parser;

import com.hepsiburada.mars.common.Constants;
import com.hepsiburada.mars.rover.Direction;
import com.hepsiburada.mars.plateau.Plateau;
import com.hepsiburada.mars.rover.Position;

public class InputParser {

    public static Plateau parsePlateau(String instruction) {
        String[] coordinates = instruction.split(Constants.EMPTY_STRING);
        return new Plateau(Integer.parseInt(coordinates[0]), Integer.parseInt(coordinates[1]));
    }

    public static Position parsePosition(String positionString) {
        String[] positionArray = positionString.split(Constants.EMPTY_STRING);
        int xCoordinate = Integer.parseInt(positionArray[0]);
        int yCoordinate = Integer.parseInt(positionArray[1]);
        Direction direction = Direction.get(positionArray[2]);
        return new Position(xCoordinate, yCoordinate, direction);
    }
}
