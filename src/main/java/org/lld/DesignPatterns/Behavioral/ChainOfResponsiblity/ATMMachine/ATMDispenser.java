package org.lld.DesignPatterns.Behavioral.ChainOfResponsiblity.ATMMachine;

public class ATMDispenser {
    public static void main(String[] args) {
        BillChain chain=new TwoThousandBill(new FiveHundredBill(new HundredBill(null)));

        chain.handleDenominations(400);
    }
}
