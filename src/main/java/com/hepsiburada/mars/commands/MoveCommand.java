package com.hepsiburada.mars.commands;

import com.hepsiburada.mars.rover.Rover;

public class MoveCommand implements ICommand {

    @Override
    public void processCommand(final Rover rover) {
        rover.move();
    }

}
