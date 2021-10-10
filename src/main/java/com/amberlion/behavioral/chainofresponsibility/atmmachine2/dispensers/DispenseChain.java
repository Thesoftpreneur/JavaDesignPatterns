package com.amberlion.behavioral.chainofresponsibility.atmmachine2.dispensers;

import com.amberlion.behavioral.chainofresponsibility.atmmachine2.Currency;

public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);
}
