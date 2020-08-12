package com.amberlion.creational.abstractFactory.furnitureFactory.coffeTables;

public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public void describe() {
        System.out.println("A new Victorian coffee table is created");
    }

    @Override
    public String getStyle() {
        return "victorian";
    }
}
