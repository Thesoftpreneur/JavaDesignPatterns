package com.amberlion.creational.strategy.ducksFactoryWithTurkeyAdapter.flyBehaviors;

public class NoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I don't fly");
    }
}
