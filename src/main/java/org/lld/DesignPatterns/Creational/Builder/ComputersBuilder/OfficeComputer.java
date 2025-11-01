package org.lld.DesignPatterns.Creational.Builder.ComputersBuilder;

public class OfficeComputer implements ComputerBuilder{
    private String CPU;
    private String RAM;
    private String STORAGE;
    private boolean isGraphicCardAvailable;


    @Override
    public void setCPU() {
        this.CPU = "15 13000K";
    }

    @Override
    public void setRAM() {
        this.RAM = "16 GB";
    }

    @Override
    public void setStorage() {
        this.STORAGE = "500 GB";
    }

    @Override
    public void setGraphicsCardEnabled() {
        this.isGraphicCardAvailable = false;
    }

    @Override
    public Computer build() {
        return null;
    }
}
