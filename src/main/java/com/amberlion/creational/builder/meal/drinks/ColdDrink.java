package com.amberlion.creational.builder.meal.drinks;

import com.amberlion.creational.builder.meal.Item;
import com.amberlion.creational.builder.meal.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
