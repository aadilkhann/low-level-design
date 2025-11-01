package org.lld.DesignPatterns.Creational.Builder.ComputersBuilder;

public interface ComputerBuilder {
    void setCPU();
    void setRAM();
    void setStorage();
    void setGraphicsCardEnabled();
    Computer build();
}
