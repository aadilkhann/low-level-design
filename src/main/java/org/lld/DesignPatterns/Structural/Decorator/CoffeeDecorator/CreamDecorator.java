package org.lld.DesignPatterns.Structural.Decorator.CoffeeDecorator;

import org.lld.DesignPatterns.Structural.Decorator.Coffee.Coffee;

public class CreamDecorator extends CoffeeDecorator{
    public CreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getPrice() {
        return coffee.getPrice()+50;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+" ,Cream";
    }
}
