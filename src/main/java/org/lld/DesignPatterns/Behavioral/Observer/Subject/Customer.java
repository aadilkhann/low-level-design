package org.lld.DesignPatterns.Behavioral.Observer.Subject;

import org.lld.DesignPatterns.Behavioral.Observer.Observers.Observer;

public class Customer implements Observer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, String msg, double newPrice) {
        System.out.println(msg + stockName + " with price " + newPrice);
    }
}
