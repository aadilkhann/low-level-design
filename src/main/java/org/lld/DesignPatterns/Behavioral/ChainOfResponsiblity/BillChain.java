package org.lld.DesignPatterns.Behavioral.ChainOfResponsiblity;

public abstract class BillChain {
    BillChain handler;
    public BillChain(BillChain handler) {
        this.handler = handler;
    }

    public abstract void handleDenominations(int amount);
}
