package com.amberlion.behavioral.chainofresponsibility.simpleprocessors.processors;

import com.amberlion.behavioral.chainofresponsibility.simpleprocessors.Number;

public abstract class Processor {
    private Processor processor;

    public Processor(Processor processor){
        this.processor = processor;
    };

    public void process(Number request){
        if(processor != null)
            processor.process(request);
    };
}
