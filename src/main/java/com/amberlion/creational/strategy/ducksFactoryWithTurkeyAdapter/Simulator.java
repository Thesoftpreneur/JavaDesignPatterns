package com.amberlion.creational.strategy.ducksFactoryWithTurkeyAdapter;

import com.amberlion.creational.strategy.ducksFactoryWithTurkeyAdapter.ducks.DecoyDuck;
import com.amberlion.creational.strategy.ducksFactoryWithTurkeyAdapter.ducks.Duck;
import com.amberlion.creational.strategy.ducksFactoryWithTurkeyAdapter.ducks.MallardDuck;
import com.amberlion.creational.strategy.ducksFactoryWithTurkeyAdapter.ducks.RubberDuck;
import com.amberlion.creational.strategy.ducksFactoryWithTurkeyAdapter.otherAnimals.TurkeyAdapter;

public class Simulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.swim();
        mallard.quack();
        mallard.display();

        Duck rubber = new RubberDuck();
        rubber.performFly();

        Duck decoy = new DecoyDuck();
        decoy.performFly();

        Duck turkeyy = new TurkeyAdapter();
        turkeyy.display();
        turkeyy.quack();
    }
}
