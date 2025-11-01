package org.lld.DesignPatterns.Creational.Builder.ComputersBuilder;

public class Director {

    public Computer buildGamingComputer(ComputerBuilder computerBuilder){
        computerBuilder.setCPU();
        computerBuilder.setRAM();
        computerBuilder.setStorage();
        computerBuilder.setGraphicsCardEnabled();
        return computerBuilder.build();
    }
}
