package com.amberlion.behavioral.chainofresponsibility.atmmachine;

public class CashDispenser {

    private int denominator;
    private CashDispenser next = null;

    public CashDispenser(int val) {
        this.denominator = val;
    }

    /* Method to chain the dispensers */
    public void setNextDispenser(CashDispenser d) {
        if (next == null) {
            next = d;
        } else {
            next.setNextDispenser(d);
        }
    }

    /* Process the request and pass it to the next processor if required */
    public void dispense(int amount) {
        if (amount >= denominator) {
            int num = amount / denominator;
            int balance = amount % denominator;
            System.out.println(num + " * " + denominator + "$");
            if (balance != 0) {
                next.dispense(balance);
            }
        } else {
            next.dispense(amount);
        }
    }
}
