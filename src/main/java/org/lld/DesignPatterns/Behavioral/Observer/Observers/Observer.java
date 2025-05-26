package org.lld.DesignPatterns.Behavioral.Observer.Observers;

public interface Observer {
    public void update(String stockName, String msg,double newPrice);
}
