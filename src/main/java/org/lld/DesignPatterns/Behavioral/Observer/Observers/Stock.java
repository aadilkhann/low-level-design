package org.lld.DesignPatterns.Behavioral.Observer.Observers;

import org.lld.DesignPatterns.Behavioral.Observer.Subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject {
    private String stockName;
    private Double price;

    public Stock(String stockName, Double price) {
        this.stockName = stockName;
        this.price = price;
    }

    List<Observer> observers=new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach((observer)->{
            observer.update(stockName,new String("Product Available:- "),price);
        });
    }

    public void setPrice(Double price) {
        this.price = price;
        notifyObserver();
    }
}
