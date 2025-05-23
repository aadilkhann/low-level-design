package org.lld.DesignPatterns.Behavioral.Strategy.PaymentMethod;

public class DibitCardPayment implements PaymentStatergy{
    @Override
    public void pay() {
        System.out.println("Paying with Debit Card");
    }
}
