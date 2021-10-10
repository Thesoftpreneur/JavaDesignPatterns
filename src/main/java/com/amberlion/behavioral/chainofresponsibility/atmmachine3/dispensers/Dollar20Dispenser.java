package com.amberlion.behavioral.chainofresponsibility.atmmachine3.dispensers;

public class Dollar20Dispenser extends DispenseChain {

    @Override
    public int returnSpecie() {
        return 20;
    }
}
