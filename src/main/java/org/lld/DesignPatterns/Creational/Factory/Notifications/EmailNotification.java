package org.lld.DesignPatterns.Creational.Factory.Notifications;

public class EmailNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Email Sent");
    }
}
