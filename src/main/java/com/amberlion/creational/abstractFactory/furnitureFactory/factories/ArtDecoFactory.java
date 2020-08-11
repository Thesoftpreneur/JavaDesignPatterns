package com.amberlion.creational.abstractFactory.furnitureFactory.factories;

import com.amberlion.creational.abstractFactory.furnitureFactory.chairs.ArtDecoChair;
import com.amberlion.creational.abstractFactory.furnitureFactory.chairs.Chair;
import com.amberlion.creational.abstractFactory.furnitureFactory.coffeTables.ArtDecoCoffeeTable;
import com.amberlion.creational.abstractFactory.furnitureFactory.coffeTables.CoffeeTable;
import com.amberlion.creational.abstractFactory.furnitureFactory.sofas.ArtDecoSofa;
import com.amberlion.creational.abstractFactory.furnitureFactory.sofas.Sofa;

public class ArtDecoFactory implements StylesFactory {
    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }
}
