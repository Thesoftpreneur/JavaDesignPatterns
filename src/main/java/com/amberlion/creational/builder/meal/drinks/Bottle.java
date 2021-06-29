package com.amberlion.creational.builder.meal.drinks;

import com.amberlion.creational.builder.meal.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
