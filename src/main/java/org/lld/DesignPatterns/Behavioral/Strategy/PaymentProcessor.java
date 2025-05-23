package org.lld.DesignPatterns.Behavioral.Strategy;

import org.lld.DesignPatterns.Behavioral.Strategy.PaymentMethod.PaymentStatergy;

public class PaymentProcessor {
    private PaymentStatergy paymentStatergy;

    public void setPaymentStatergy(PaymentStatergy paymentStatergy) {
        this.paymentStatergy = paymentStatergy;
    }

    public void processPayment(){
        if (paymentStatergy!=null) paymentStatergy.pay();
        else System.out.println("Please choose Payment Method");
    }
}
