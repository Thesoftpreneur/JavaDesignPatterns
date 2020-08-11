package com.amberlion.creational.abstractFactory.furnitureFactory.factories;

import com.amberlion.creational.abstractFactory.furnitureFactory.chairs.Chair;
import com.amberlion.creational.abstractFactory.furnitureFactory.chairs.VictorianChair;
import com.amberlion.creational.abstractFactory.furnitureFactory.coffeTables.CoffeeTable;
import com.amberlion.creational.abstractFactory.furnitureFactory.coffeTables.VictorianCoffeeTable;
import com.amberlion.creational.abstractFactory.furnitureFactory.sofas.Sofa;
import com.amberlion.creational.abstractFactory.furnitureFactory.sofas.VictorianSofa;

public class VictorianFactory implements StylesFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
