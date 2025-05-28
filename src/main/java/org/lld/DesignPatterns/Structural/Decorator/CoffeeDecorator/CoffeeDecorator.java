package org.lld.DesignPatterns.Structural.Decorator.CoffeeDecorator;

import org.lld.DesignPatterns.Structural.Decorator.Coffee.Coffee;

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;
    public CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }
    @Override
    public int getPrice() {
        return coffee.getPrice();
    }
    @Override
    public String getDescription() {
        return coffee.getDescription();
    }
}
