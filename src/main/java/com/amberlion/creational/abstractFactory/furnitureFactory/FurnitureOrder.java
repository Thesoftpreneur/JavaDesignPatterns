package com.amberlion.creational.abstractFactory.furnitureFactory;

import com.amberlion.creational.abstractFactory.furnitureFactory.chairs.Chair;
import com.amberlion.creational.abstractFactory.furnitureFactory.coffeTables.CoffeeTable;
import com.amberlion.creational.abstractFactory.furnitureFactory.factories.ArtDecoFactory;
import com.amberlion.creational.abstractFactory.furnitureFactory.factories.ModernFactory;
import com.amberlion.creational.abstractFactory.furnitureFactory.factories.StylesFactory;
import com.amberlion.creational.abstractFactory.furnitureFactory.factories.VictorianFactory;
import com.amberlion.creational.abstractFactory.furnitureFactory.sofas.Sofa;

public class FurnitureOrder {
    private Chair chair;
    private CoffeeTable coffeeTable;
    private Sofa sofa;

    public FurnitureOrder(StylesFactory style) {
        chair = style.createChair();
        coffeeTable = style.createCoffeeTable();
        sofa = style.createSofa();
    }
    public void describe() {
        chair.describe();
        coffeeTable.describe();
        sofa.describe();
    }

    public static FurnitureOrder withStyle(String orderedStyle) {
        StylesFactory style;
        FurnitureOrder order;
        if (orderedStyle.equals("modern")) {
            style = new ModernFactory();
        } else if (orderedStyle.equals("artDeco")){
            style = new ArtDecoFactory();
        } else {
            style = new VictorianFactory();
        }
        order = new FurnitureOrder(style);

        return order;
    }

    public static void main(String[] args) {
        FurnitureOrder orderr = FurnitureOrder.withStyle("artDeco");
        orderr.describe();
        StylesFactory style = new ModernFactory();
        FurnitureOrder order = new FurnitureOrder(style);
        order.describe();

    }
}
