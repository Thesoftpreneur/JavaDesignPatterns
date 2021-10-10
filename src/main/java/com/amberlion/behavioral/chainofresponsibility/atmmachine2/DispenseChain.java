package com.amberlion.behavioral.chainofresponsibility.atmmachine2;

public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);
}
