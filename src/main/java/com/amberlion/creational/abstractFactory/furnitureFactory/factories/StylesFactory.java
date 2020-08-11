package com.amberlion.creational.abstractFactory.furnitureFactory.factories;

import com.amberlion.creational.abstractFactory.furnitureFactory.chairs.Chair;
import com.amberlion.creational.abstractFactory.furnitureFactory.coffeTables.CoffeeTable;
import com.amberlion.creational.abstractFactory.furnitureFactory.sofas.Sofa;

public interface StylesFactory {
    Chair createChair();
    CoffeeTable createCoffeeTable();
    Sofa createSofa();
}
