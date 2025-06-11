package org.lld.DesignPatterns.Behavioral.ChainOfResponsiblity;

public class TwoThousandBill extends BillChain{
    public TwoThousandBill(BillChain handler) {
        super(handler);
    }

    @Override
    public void handleDenominations(int amount) {
        if(amount > 2000){
            int denominationCount = amount / 2000;
            int leftAmount = amount - denominationCount * 2000;

            System.out.println("Dispending "+denominationCount+" of 2 Thousand Bill");

            if(leftAmount > 0 && handler!=null){
                handler.handleDenominations(leftAmount);
            }
        }
        else if(amount < 2000 && handler!=null) {
            handler.handleDenominations(amount);
        }
    }

}
