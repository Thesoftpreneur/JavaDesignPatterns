package com.amberlion.creational.strategy.ducksFactory.quacking;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
