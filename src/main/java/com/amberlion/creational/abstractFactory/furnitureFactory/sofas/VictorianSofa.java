package com.amberlion.creational.abstractFactory.furnitureFactory.sofas;

public class VictorianSofa implements Sofa {
    @Override
    public void describe() {
        System.out.println("A new Victorian sofa is created");
    }

    @Override
    public String getStyle() {
        return "victorian";
    }

}
