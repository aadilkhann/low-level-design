package org.lld.DesignPatterns.Behavioral.Strategy.PaymentMethod;

public class CreditCardPayment implements PaymentStatergy {
    @Override
    public void pay() {
        System.out.println("Paying with Credit Card");
    }
}
