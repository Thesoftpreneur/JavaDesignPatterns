package com.amberlion.behavioral.chainofresponsibility.simpleprocessors;

import com.amberlion.behavioral.chainofresponsibility.simpleprocessors.processors.NegativeProcessor;
import com.amberlion.behavioral.chainofresponsibility.simpleprocessors.processors.PositiveProcessor;
import com.amberlion.behavioral.chainofresponsibility.simpleprocessors.processors.Processor;
import com.amberlion.behavioral.chainofresponsibility.simpleprocessors.processors.ZeroProcessor;

public class Chain {
    Processor chain;

    public Chain(){
        buildChain();
    }

    private void buildChain(){
        chain = new PositiveProcessor(new ZeroProcessor(new NegativeProcessor(null)));
    }

    public void process(Number request) {
        chain.process(request);
    }

}
