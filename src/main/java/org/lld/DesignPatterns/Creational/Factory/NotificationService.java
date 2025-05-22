package org.lld.DesignPatterns.Creational.Factory;

import org.lld.DesignPatterns.Creational.Factory.Notifications.Notification;

public class NotificationService {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.getNotification("email");
        notification.notifyUser();
    }
}
