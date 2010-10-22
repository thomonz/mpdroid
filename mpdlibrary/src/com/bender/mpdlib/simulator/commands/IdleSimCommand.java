package com.bender.mpdlib.simulator.commands;

import com.bender.mpdlib.Subsystem;

import java.io.PrintWriter;

/**
 * todo: replace with documentation
 */
public class IdleSimCommand extends SimCommand
{
    private SubSystemSupport subSystemSupport;
    private IdleRunnable idleRunnable;

    public IdleSimCommand(PrintWriter pipe, SubSystemSupport subSystemSupport)
    {
        super(pipe);
        idleRunnable = new IdleRunnable();
        this.subSystemSupport = subSystemSupport;
    }

    public void run()
    {
        subSystemSupport.getIdleStrategy().execute(idleRunnable);
    }

    private class IdleRunnable implements Runnable
    {
        public void run()
        {
            Subsystem changedSubsystem = subSystemSupport.waitForSubSystemChange();
            writer.println("changed: " + changedSubsystem);
            writer.println("OK");
        }
    }
}
