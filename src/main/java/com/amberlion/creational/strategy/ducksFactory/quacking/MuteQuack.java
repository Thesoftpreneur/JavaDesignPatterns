package com.amberlion.creational.strategy.ducksFactory.quacking;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
