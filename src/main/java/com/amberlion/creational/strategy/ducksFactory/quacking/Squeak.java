package com.amberlion.creational.strategy.ducksFactory.quacking;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
