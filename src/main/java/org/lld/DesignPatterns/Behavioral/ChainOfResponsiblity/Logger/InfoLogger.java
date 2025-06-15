package org.lld.DesignPatterns.Behavioral.ChainOfResponsiblity.Logger;

public class InfoLogger extends Logger{

    public InfoLogger(LogLevel level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.out.println(LogLevel.INFO+": " + message);
    }
}
