package com.bender.mpdlib.commands;

import com.bender.mpdlib.Pipe;

/**
 */
public class NextCommand extends BasicCommand
{
    public NextCommand(Pipe commandPipe)
    {
        super(commandPipe, MpdCommands.next);
    }
}
