package com.amberlion.structural.bridge.bridge;

import com.amberlion.structural.bridge.bridge.abstraction.RefinedAbstractionA;
import com.amberlion.structural.bridge.bridge.abstraction.RefinedAbstractionB;
import com.amberlion.structural.bridge.bridge.implementator.ConcreteImplementorA;
import com.amberlion.structural.bridge.bridge.implementator.ConcreteImplementorB;
import com.amberlion.structural.bridge.bridge.implementator.Implementor;

public class Demo {
    public static void main(String[] args) {
        testImplementor(new ConcreteImplementorA());
        testImplementor(new ConcreteImplementorB());
    }
    public static void testImplementor(Implementor implementor) {
        RefinedAbstractionA refinedAbstractionA = new RefinedAbstractionA(implementor);
        refinedAbstractionA.function();
        System.out.println("********************************************************");
        RefinedAbstractionB refinedAbstractionB = new RefinedAbstractionB(implementor);
        refinedAbstractionB.function();
        System.out.println("*********************************************************\n\n");
    }
}
