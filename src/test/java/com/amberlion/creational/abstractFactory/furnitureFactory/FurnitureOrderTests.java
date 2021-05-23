package com.amberlion.creational.abstractFactory.furnitureFactory;

import org.junit.Assert;
import org.junit.Test;

public class FurnitureOrderTests {

    @Test
    public void testGetFurnitureArtDeco() {
        FurnitureOrder order = FurnitureOrder.withStyle("artDeco");
        Assert.assertEquals(order.getChair().getStyle(), "artDeco");
        Assert.assertEquals(order.getSofa().getStyle(), "artDeco");
        Assert.assertEquals(order.getCoffeeTable().getStyle(), "artDeco");
    }

    @Test
    public void testGetFurnitureModern() {
        FurnitureOrder order = FurnitureOrder.withStyle("modern");
        Assert.assertEquals(order.getChair().getStyle(), "modern");
        Assert.assertEquals(order.getSofa().getStyle(), "modern");
        Assert.assertEquals(order.getCoffeeTable().getStyle(), "modern");
    }

    @Test
    public void testGetFurnitureVictorian() {
        FurnitureOrder order = FurnitureOrder.withStyle("victorian");
        Assert.assertEquals(order.getChair().getStyle(), "victorian");
        Assert.assertEquals(order.getSofa().getStyle(), "victorian");
        Assert.assertEquals(order.getCoffeeTable().getStyle(), "victorian");
    }
}