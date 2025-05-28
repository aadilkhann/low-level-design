package org.lld.DesignPatterns.Structural.Decorator.Coffee;

public class Espresso implements Coffee{

    @Override
    public int getPrice() {
        return 100;
    }

    @Override
    public String getDescription() {
        return new String("Espresso");
    }
}
