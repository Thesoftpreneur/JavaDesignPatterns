package com.amberlion.creational.strategy.ducksFactoryWithTurkeyAdapter.ducks;

import com.amberlion.creational.strategy.ducksFactoryWithTurkeyAdapter.flyBehaviors.FlyBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("I'm swimming!");
    }
    public void quack() {
        System.out.println("I'm quacking!");
    }
    public abstract void display();

}
