package com.amberlion.creational.abstractFactory.furnitureFactory.factories;

import com.amberlion.creational.abstractFactory.furnitureFactory.chairs.Chair;
import com.amberlion.creational.abstractFactory.furnitureFactory.chairs.ModernChair;
import com.amberlion.creational.abstractFactory.furnitureFactory.coffeTables.CoffeeTable;
import com.amberlion.creational.abstractFactory.furnitureFactory.coffeTables.ModernCoffeeTable;
import com.amberlion.creational.abstractFactory.furnitureFactory.sofas.ModernSofa;
import com.amberlion.creational.abstractFactory.furnitureFactory.sofas.Sofa;

public class ModernFactory implements StylesFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
