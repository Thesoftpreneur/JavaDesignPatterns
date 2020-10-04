package com.amberlion.creational.strategy.ducksFactoryWithTurkeyAdapter.ducks;

import com.amberlion.creational.strategy.ducksFactoryWithTurkeyAdapter.flyBehaviors.NoFly;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        this.flyBehavior = new NoFly();
    }
    @Override
    public void display() {
        System.out.println("I look like a Decoy duck!");
    }
}
