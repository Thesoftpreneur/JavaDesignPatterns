package com.amberlion.behavioral.chainofresponsibility.atmmachine3.dispensers;

public class Dollar10Dispenser extends DispenseChain {

    @Override
    public int returnSpecie() {
        return 10;
    }
}
