package com.amberlion.creational.abstractFactory.furnitureFactory.chairs;

public class ModernChair implements Chair {
    @Override
    public void describe() {
        System.out.println("A new Modern chair is created");
    }

    @Override
    public String getStyle() {
        return "modern";
    }
}
