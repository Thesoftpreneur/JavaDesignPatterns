package com.amberlion.creational.strategy.ducksFactoryWithTurkeyAdapter.flyBehaviors;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
