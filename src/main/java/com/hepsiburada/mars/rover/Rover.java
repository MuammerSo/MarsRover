package com.hepsiburada.mars.rover;

import com.hepsiburada.mars.commands.CommandFactory;
import com.hepsiburada.mars.plateau.Plateau;

public class Rover {
    private Position position;
    private Plateau plateau;

    private CommandFactory commandFactory = new CommandFactory();

    public Rover(Plateau plateau, Position position) {
        this.plateau = plateau;
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void process(String command) {
        command.chars().forEach(i -> commandFactory.createCommand((char)i).processCommand(this));
    }

    public void move() {
        if(this.plateau.isValidMove(this.position.moveAhead())) {
            this.position = this.position.moveAhead();
        }
    }

    public void turnLeft() {
        this.position = this.position.rotateLeft();
    }

    public void turnRight() {
        this.position = this.position.rotateRight();
    }

    @Override
    public String toString() {
        return this.position.toString();
    }
}
