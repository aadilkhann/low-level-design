package org.lld.DesignPatterns.Creational.Builder;

public class ComputerBuilder {
    private String CPU;
    private String RAM;
    private String STORAGE;
    private boolean isGraphicCardAvailable;

    public ComputerBuilder setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }

    public ComputerBuilder setRAM(String RAM) {
        this.RAM = RAM;
        return this;
    }

    public ComputerBuilder setSTORAGE(String STORAGE) {
        this.STORAGE = STORAGE;
        return this;
    }

    public ComputerBuilder setGraphicCardAvailable(boolean graphicCardAvailable) {
        isGraphicCardAvailable = graphicCardAvailable;
        return this;
    }

    public Computer buildComputer() {
        return new Computer(CPU, RAM, STORAGE, isGraphicCardAvailable);
    }
}
