package com.amberlion.creational.strategy.ducksFactoryWithTurkeyAdapter.otherAnimals;

import com.amberlion.creational.strategy.ducksFactoryWithTurkeyAdapter.ducks.Duck;

public class TurkeyAdapter extends Duck {
    Turkey turkey;

    public TurkeyAdapter() {
        this.turkey = new Turkey();
    }
    public void quack() {
        turkey.gobble();
    }
    @Override
    public void display() {
        System.out.println("I look like a turkey!!");
    }
}
