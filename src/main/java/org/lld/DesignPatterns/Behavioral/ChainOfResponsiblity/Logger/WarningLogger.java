package org.lld.DesignPatterns.Behavioral.ChainOfResponsiblity.Logger;

public class WarningLogger extends Logger{

    @Override
    protected void write(String message) {
        System.out.println(LogLevel.WARNING+": " + message);
    }
}
