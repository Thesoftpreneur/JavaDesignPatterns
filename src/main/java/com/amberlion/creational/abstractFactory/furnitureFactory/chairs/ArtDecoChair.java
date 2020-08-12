package com.amberlion.creational.abstractFactory.furnitureFactory.chairs;

public class ArtDecoChair implements Chair {
    @Override
    public void describe() {
        System.out.println("A new Art Deco chair is created");
    }

    @Override
    public String getStyle() {
        return "artDeco";
    }
}
