package org.lld.DesignPatterns.Behavioral.ChainOfResponsiblity.Logger;

public class ErrorLogger extends Logger{

    @Override
    protected void write(String message) {
        System.out.println(LogLevel.ERROR+": " + message);
    }
}
