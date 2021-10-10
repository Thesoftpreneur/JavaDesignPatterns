package com.amberlion.behavioral.chainofresponsibility.simpleprocessors.processors;

import com.amberlion.behavioral.chainofresponsibility.simpleprocessors.Number;

public class ZeroProcessor extends Processor {
    public ZeroProcessor(Processor processor){
        super(processor);
    }

    public void process(Number request)
    {
        if (request.getNumber() == 0)
        {
            System.out.println("ZeroProcessor : " + request.getNumber());
        }
        else
        {
            super.process(request);
        }
    }
}
