package com.amberlion.creational.builder.meal.food;

import com.amberlion.creational.builder.meal.Item;
import com.amberlion.creational.builder.meal.Packing;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
