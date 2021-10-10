package com.hepsiburada.mars.commands;

import com.hepsiburada.mars.rover.Rover;

public class RightCommand implements ICommand {

    @Override
    public void processCommand(final Rover rover) {
        rover.turnRight();
    }

}
