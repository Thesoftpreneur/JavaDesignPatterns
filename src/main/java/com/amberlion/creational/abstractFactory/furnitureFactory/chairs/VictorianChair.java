package com.amberlion.creational.abstractFactory.furnitureFactory.chairs;

public class VictorianChair implements Chair {
    @Override
    public void describe() {
        System.out.println("A new Victorian chair is created");
    }

    @Override
    public String getStyle() {
        return "victorian";
    }
}
