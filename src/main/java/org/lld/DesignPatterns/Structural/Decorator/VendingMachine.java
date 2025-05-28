package org.lld.DesignPatterns.Structural.Decorator;

import org.lld.DesignPatterns.Structural.Decorator.Coffee.BasicCoffee;
import org.lld.DesignPatterns.Structural.Decorator.Coffee.Coffee;
import org.lld.DesignPatterns.Structural.Decorator.Coffee.Latte;
import org.lld.DesignPatterns.Structural.Decorator.CoffeeDecorator.ChocoChipsDecorator;
import org.lld.DesignPatterns.Structural.Decorator.CoffeeDecorator.CreamDecorator;

public class VendingMachine {
    public static void main(String[] args) {
        Coffee coffee = new ChocoChipsDecorator(new CreamDecorator(new Latte()));
        System.out.println(coffee.getPrice());
        System.out.println(coffee.getDescription());
    }
}
