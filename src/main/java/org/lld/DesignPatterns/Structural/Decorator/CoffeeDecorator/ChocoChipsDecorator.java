package org.lld.DesignPatterns.Structural.Decorator.CoffeeDecorator;

import org.lld.DesignPatterns.Structural.Decorator.Coffee.Coffee;

public class ChocoChipsDecorator extends CoffeeDecorator{
    public ChocoChipsDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public int getPrice() {
        return coffee.getPrice()+30;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+" ,Choco Chips";
    }
}
