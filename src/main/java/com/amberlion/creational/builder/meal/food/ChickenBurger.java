package com.amberlion.creational.builder.meal.food;

import com.amberlion.creational.builder.meal.food.Burger;

public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
