package org.lld.DesignPatterns.Behavioral.ChainOfResponsiblity;

public class FiveHundredBill extends BillChain{


    public FiveHundredBill(BillChain handler) {
        super(handler);
    }

    @Override
    public void handleDenominations(int amount) {
        if(amount > 500){
            int denominationCount = amount / 500;
            int leftAmount = amount - denominationCount * 500;

            System.out.println("Dispending "+denominationCount+" of 5 Hundred Bill");

            if(leftAmount > 0 && handler!=null){
                handler.handleDenominations(leftAmount);
            }
        }
        else if(amount < 500 && handler!=null) {
            handler.handleDenominations(amount);
        }
    }
}
