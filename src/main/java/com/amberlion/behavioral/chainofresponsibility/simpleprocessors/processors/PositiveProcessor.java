package com.amberlion.behavioral.chainofresponsibility.simpleprocessors.processors;

import com.amberlion.behavioral.chainofresponsibility.simpleprocessors.Number;

public class PositiveProcessor extends Processor {
    public PositiveProcessor(Processor processor){
        super(processor);
    }

    public void process(Number request)
    {
        if (request.getNumber() > 0)
        {
            System.out.println("PositiveProcessor : " + request.getNumber());
        }
        else
        {
            super.process(request);
        }
    }
}
