package org.lld.DesignPatterns.Creational.Builder.ComputersBuilder;

public class BuilderPatternWithDirector {
    public static void main(String[] args) {
        ComputerBuilder computerBuilder=new GamingComputer();
        Director director=new Director();
        Computer gamingPC=director.buildGamingComputer(computerBuilder);
        System.out.printf("Gaming PC: %s\n",gamingPC);
    }
}
