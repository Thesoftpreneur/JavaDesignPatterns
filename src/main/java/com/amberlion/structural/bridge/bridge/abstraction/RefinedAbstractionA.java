package com.amberlion.structural.bridge.bridge.abstraction;

import com.amberlion.structural.bridge.bridge.implementator.Implementor;

public class RefinedAbstractionA implements Abstraction {

    protected Implementor implementor;

    public RefinedAbstractionA() {}

    public RefinedAbstractionA(Implementor implementor) {
        this.implementor=implementor;
    }

    @Override
    public void function() {
        System.out.println("RefinedAbstractionA function is invoked");
        System.out.print("->");
        implementor.implementation();
    }
}
