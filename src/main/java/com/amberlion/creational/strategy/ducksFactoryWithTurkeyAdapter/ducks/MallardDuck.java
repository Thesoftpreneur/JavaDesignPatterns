package com.amberlion.creational.strategy.ducksFactoryWithTurkeyAdapter.ducks;

import com.amberlion.creational.strategy.ducksFactoryWithTurkeyAdapter.flyBehaviors.FlyWithWings;

public class MallardDuck extends Duck{

    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I look like a Mallard duck!");
    }
}
