package org.lld.DesignPatterns.Creational.Builder.ComputersBuilder;

public class GamingComputer implements ComputerBuilder{
    private String CPU;
    private String RAM;
    private String STORAGE;
    private boolean isGraphicCardAvailable;


    @Override
    public void setCPU() {
        this.CPU = "i9 13000H";
    }

    @Override
    public void setRAM() {
        this.RAM = "32 GB";
    }

    @Override
    public void setStorage() {
        this.STORAGE = "1 TB";
    }

    @Override
    public void setGraphicsCardEnabled() {
        this.isGraphicCardAvailable = true;
    }

    @Override
    public Computer build() {
        return new Computer(CPU, RAM, STORAGE, isGraphicCardAvailable);
    }
}
