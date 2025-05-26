package org.lld.DesignPatterns.Behavioral.Observer.Subject;

import org.lld.DesignPatterns.Behavioral.Observer.Observers.Observer;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();

}
