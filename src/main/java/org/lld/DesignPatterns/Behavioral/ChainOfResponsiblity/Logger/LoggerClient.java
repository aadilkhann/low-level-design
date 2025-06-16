package org.lld.DesignPatterns.Behavioral.ChainOfResponsiblity.Logger;

public class LoggerClient {
    public static void main(String[] args) {
//        Logger logger=new InfoLogger(new WarningLogger(new ErrorLogger(null)));
        Logger logger=new InfoLogger(LogLevel.INFO);
        logger.setNextLogger(new ErrorLogger(LogLevel.ERROR))
                .setNextLogger(new WarningLogger(LogLevel.WARNING));


        logger.log(LogLevel.INFO,"This is a INFO test");
        logger.log(LogLevel.WARNING,"This is a WARNING test");
        logger.log(LogLevel.ERROR,"This is a ERROR test");
    }
}
