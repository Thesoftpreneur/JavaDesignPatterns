package com.amberlion.behavioral.chainofresponsibility.atmmachine3.dispensers;

import com.amberlion.behavioral.chainofresponsibility.atmmachine3.Currency;

public abstract class DispenseChain {

    private DispenseChain chain;

    public abstract int returnSpecie();

    public void setNextChain(DispenseChain nextChain) {
        this.chain=nextChain;
    }

    public void dispense(Currency cur) {
        if (cur.getAmount() >= returnSpecie()) {
            int num = cur.getAmount()/ returnSpecie();
            int remainder = cur.getAmount() % returnSpecie();
            System.out.println("Dispensing "+num+" "+ returnSpecie()+"$ note");
            if (remainder != 0) {
                this.chain.dispense(new Currency(remainder));
            }
        } else {
            this.chain.dispense(cur);
        }
    }
}
