package org.lld.DesignPatterns.Structural.Decorator.Coffee;

public class BasicCoffee implements Coffee{
    @Override
    public int getPrice() {
        return 50;
    }

    @Override
    public String getDescription() {
        return new String("Coffee");
    }
}
