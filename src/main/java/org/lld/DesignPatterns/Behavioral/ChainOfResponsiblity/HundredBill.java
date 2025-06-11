package org.lld.DesignPatterns.Behavioral.ChainOfResponsiblity;

public class HundredBill extends BillChain {

    public HundredBill(BillChain handler) {
        super(handler);
    }

    @Override
    public void handleDenominations(int amount) {
        if(amount > 100){
            int denominationCount = amount / 100;
            int leftAmount = amount - denominationCount * 100;

            System.out.println("Dispending "+denominationCount+" of Hundred Bill");

            if(leftAmount > 0 && handler!=null){
                handler.handleDenominations(leftAmount);
            }
        }
        else if(amount < 100 && handler!=null) {
            handler.handleDenominations(amount);
        }
    }
}
