package org.lld.DesignPatterns.Behavioral.Strategy.PaymentMethod;

public class UPIPayment implements PaymentStatergy{
    @Override
    public void pay() {
        System.out.println("Paying with UPI");
    }
}
