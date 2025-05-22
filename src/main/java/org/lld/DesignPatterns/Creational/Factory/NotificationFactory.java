package org.lld.DesignPatterns.Creational.Factory;

import org.lld.DesignPatterns.Creational.Factory.Notifications.EmailNotification;
import org.lld.DesignPatterns.Creational.Factory.Notifications.Notification;
import org.lld.DesignPatterns.Creational.Factory.Notifications.PushNotification;
import org.lld.DesignPatterns.Creational.Factory.Notifications.SMSNotification;

public class NotificationFactory {
    public static Notification getNotification(String type){
        if(type==null || type.isEmpty()){
            return null;
        }
        switch (type){
            case "email":
                return new EmailNotification();
            case "sms":
                return new SMSNotification();
            case "push":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Invalid notification type");
        }
    }
}
