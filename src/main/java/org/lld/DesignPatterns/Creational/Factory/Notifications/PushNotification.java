package org.lld.DesignPatterns.Creational.Factory.Notifications;

public class PushNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Push Notification Sent");
    }
}
