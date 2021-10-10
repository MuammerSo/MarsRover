package com.hepsiburada.mars.plateau;

import com.hepsiburada.mars.common.Constants;
import com.hepsiburada.mars.rover.Position;

public class Plateau {
    private int x;
    private int y;

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public Plateau(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isValidMove(Position position) {
        return position.isWithIn(this.x, this.y) && position.isOutside(Constants.MIN_X_COORDINATE, Constants.MIN_Y_COORDINATE);
    }

}
