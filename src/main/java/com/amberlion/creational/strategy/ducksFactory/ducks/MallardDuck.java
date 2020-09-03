package com.amberlion.creational.strategy.ducksFactory.ducks;

import com.amberlion.creational.strategy.ducksFactory.flying.FlyWithWings;
import com.amberlion.creational.strategy.ducksFactory.quacking.MuteQuack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super();
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new MuteQuack();
        System.out.println("The duck is mallard");

    }

    @Override
    public void display() {
        System.out.println("I\'m a real Mallard duck!");
    }
}
