package org.lld.DesignPatterns.Behavioral.ChainOfResponsiblity.Logger;

public abstract class Logger {
    LogLevel  level;
    Logger nextLogger;

    public Logger setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
        return nextLogger;
    }

    public void log(LogLevel logLevel, String message){
        if(this.level==(logLevel)){
            write(message);
        }
        if(nextLogger!=null){
                nextLogger.log(logLevel, message);
        }
    }

    protected abstract void write(String message);
}
