package org.lld.DesignPatterns.Structural.Decorator.Coffee;

public class Latte implements Coffee {
    @Override
    public int getPrice() {
        return 150;
    }

    @Override
    public String getDescription() {
        return new String("Latte");
    }
}
