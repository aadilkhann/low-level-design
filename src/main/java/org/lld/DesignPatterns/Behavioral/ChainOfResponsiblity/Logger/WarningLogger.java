package org.lld.DesignPatterns.Behavioral.ChainOfResponsiblity.Logger;

public class WarningLogger extends Logger{

    public WarningLogger(LogLevel level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.out.println(LogLevel.WARNING+": " + message);
    }
}
