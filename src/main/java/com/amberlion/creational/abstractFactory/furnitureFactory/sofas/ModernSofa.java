package com.amberlion.creational.abstractFactory.furnitureFactory.sofas;

public class ModernSofa implements Sofa {
    @Override
    public void describe() {
        System.out.println("A new Modern sofa is created");
    }

    @Override
    public String getStyle() {
        return "modern";
    }
}
