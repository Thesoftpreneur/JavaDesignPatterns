package com.amberlion.creational.strategy.ducksFactory;

import com.amberlion.creational.strategy.ducksFactory.ducks.Duck;
import com.amberlion.creational.strategy.ducksFactory.ducks.MallardDuck;
import com.amberlion.creational.strategy.ducksFactory.flying.FlyNoWay;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mall = new MallardDuck();
        mall.performFly();
        mall.performQuack();
        mall.setFlyBehavior(new FlyNoWay());
        mall.performFly();
    }
}
