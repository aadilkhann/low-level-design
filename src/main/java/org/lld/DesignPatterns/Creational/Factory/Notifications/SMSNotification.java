package org.lld.DesignPatterns.Creational.Factory.Notifications;

public class SMSNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("SMS Sent");
    }
}
