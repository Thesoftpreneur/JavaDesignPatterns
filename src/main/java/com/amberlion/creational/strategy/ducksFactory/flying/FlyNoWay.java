package com.amberlion.creational.strategy.ducksFactory.flying;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can\'t fly.");
    }
}
