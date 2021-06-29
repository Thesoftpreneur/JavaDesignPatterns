package com.amberlion.creational.builder.meal.food;

import com.amberlion.creational.builder.meal.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
