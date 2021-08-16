package com.amberlion.structural.bridge.bridge.abstraction;

import com.amberlion.structural.bridge.bridge.implementator.Implementor;

public class RefinedAbstractionB implements Abstraction {

    protected Implementor implementor;

    public RefinedAbstractionB() {}

    public RefinedAbstractionB(Implementor implementor) {
        this.implementor=implementor;
    }

    @Override
    public void function() {
        System.out.println("RefinedAbstractionB function is invoked");
        System.out.print("->");
        implementor.implementation();
    }
}
