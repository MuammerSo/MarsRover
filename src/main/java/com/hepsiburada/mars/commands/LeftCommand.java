package com.hepsiburada.mars.commands;

import com.hepsiburada.mars.rover.Rover;

public class LeftCommand implements ICommand {

    @Override
    public void processCommand(final Rover rover) {
        rover.turnLeft();
    }

}
