package org.lld.DesignPatterns.Creational.Builder.ComputerBuilder;

public class Computer {
    private String CPU;
    private String RAM;
    private String STORAGE;
    private boolean isGraphicCardAvailable;

    public Computer(String CPU, String RAM, String STORAGE, boolean isGraphicCardAvailable) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.STORAGE = STORAGE;
        this.isGraphicCardAvailable = isGraphicCardAvailable;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", STORAGE='" + STORAGE + '\'' +
                ", isGraphicCardAvailable=" + isGraphicCardAvailable +
                '}';
    }
}
