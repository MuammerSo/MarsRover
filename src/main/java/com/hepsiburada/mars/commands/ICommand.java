package com.hepsiburada.mars.commands;

import com.hepsiburada.mars.rover.Rover;

public interface ICommand {

    void processCommand(final Rover rover);

}
