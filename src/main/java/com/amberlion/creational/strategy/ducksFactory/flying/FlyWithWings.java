package com.amberlion.creational.strategy.ducksFactory.flying;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I\'m flying!");
    }
}
