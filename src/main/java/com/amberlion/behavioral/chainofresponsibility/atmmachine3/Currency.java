package com.amberlion.behavioral.chainofresponsibility.atmmachine3;

public class Currency {
    private int amount;

    public Currency(int amt){
        this.amount=amt;
    }

    public int getAmount(){
        return this.amount;
    }
}
