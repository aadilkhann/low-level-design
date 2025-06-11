package org.lld.DesignPatterns.Behavioral.ChainOfResponsiblity.Logger;

public class InfoLogger extends Logger{

    @Override
    protected void write(String message) {
        System.out.println(LogLevel.INFO+": " + message);
    }
}
