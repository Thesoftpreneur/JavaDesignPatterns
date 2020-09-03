package com.amberlion.creational.strategy.ducksFactory.ducks;

import com.amberlion.creational.strategy.ducksFactory.flying.FlyBehavior;
import com.amberlion.creational.strategy.ducksFactory.quacking.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
        System.out.println("A duck is created");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public abstract void display();
    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }
    public void swim() {
        System.out.println("All ducksd float, even decoys!");
    }

}
