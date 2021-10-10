package com.hepsiburada.mars.commands;

import com.hepsiburada.mars.common.Constants;

public class CommandFactory {

    public ICommand createCommand( Character command) {
        if(command.equals(Constants.MOVE_COMMAND)){
            return new MoveCommand();
        }
        else if(command.equals(Constants.LEFT_COMMAND)){
            return new LeftCommand();
        }
        else if (command.equals(Constants.RIGHT_COMMAND)){
            return new RightCommand();
        }
        return null;
    }
}
