package org.lld.DesignPatterns.Creational.Builder.ComputerBuilder;

public class BuilderPattern {
    public static void main(String[] args) {
        Computer gamingPC=new ComputerBuilder()
                .setCPU("i9 13000H")
                .setRAM("32 GB")
                .setSTORAGE("1 TB")
                .setGraphicCardAvailable(true)
                .buildComputer();

        System.out.println(gamingPC);
    }
}
