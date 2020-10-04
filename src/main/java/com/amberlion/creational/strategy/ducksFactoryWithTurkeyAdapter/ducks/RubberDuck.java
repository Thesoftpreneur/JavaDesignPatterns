package com.amberlion.creational.strategy.ducksFactoryWithTurkeyAdapter.ducks;

import com.amberlion.creational.strategy.ducksFactoryWithTurkeyAdapter.flyBehaviors.NoFly;

public class RubberDuck extends Duck {

    public RubberDuck() {
        this.flyBehavior =  new NoFly();
    }

    @Override
    public void display() {
        System.out.println("I look like a rubber duck!");
    }
}
