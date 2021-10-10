package com.hepsiburada.mars.rover;

import com.hepsiburada.mars.common.Constants;

public class Position {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getY() {
        return y;
    }

    private Direction direction;

    public Position(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Position rotateRight() {
        return new Position(x, y, this.direction.right());
    }

    public Position rotateLeft() {
        return new Position(x, y, this.direction.left());
    }

    public Position moveAhead() {
        switch (this.direction.toString()) {
            case Constants.POSITION_EAST:
                return new Position(x+1, y, direction);
            case Constants.POSITION_WEST:
                return new Position(x-1, y, direction);
            case Constants.POSITION_NORTH:
                return new Position(x, y+1, direction);
            case Constants.POSITION_SOUTH:
                return new Position(x, y-1, direction);
            default:
                throw new IllegalStateException("Unknown Direction Input");
        }
    }

    public boolean isWithIn(int x, int y) {
        return this.x <= x && this.y <= y;
    }

    public boolean isOutside(int x, int y) {
        return this.x >= x && this.y >= y;
    }

    @Override
    public String toString() {
        return x + Constants.EMPTY_STRING + y + Constants.EMPTY_STRING + direction;
    }
}
