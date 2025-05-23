package org.lld.DesignPatterns.Behavioral.Strategy;

import org.lld.DesignPatterns.Behavioral.Strategy.PaymentMethod.CreditCardPayment;
import org.lld.DesignPatterns.Behavioral.Strategy.PaymentMethod.UPIPayment;

public class PaymentStatergy {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor=new PaymentProcessor();

        paymentProcessor.setPaymentStatergy(new CreditCardPayment());
        paymentProcessor.processPayment();

        paymentProcessor.setPaymentStatergy(new UPIPayment());
        paymentProcessor.processPayment();
    }
}
