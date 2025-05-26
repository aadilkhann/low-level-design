package org.lld.DesignPatterns.Behavioral.Observer;

import org.lld.DesignPatterns.Behavioral.Observer.Observers.Stock;
import org.lld.DesignPatterns.Behavioral.Observer.Subject.Customer;

public class Notification {
    public static void main(String[] args) throws InterruptedException {
        Customer c1=new Customer("Adil");
        Customer c2=new Customer("Khan");

        Stock product=new Stock("iPhone",100000.0);
        product.registerObserver(c1);
        product.registerObserver(c2);

        product.notifyObserver();

        Thread.sleep(1000);

        product.removeObserver(c2);
        product.notifyObserver();

    }
}
