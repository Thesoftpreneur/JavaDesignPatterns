package com.amberlion.creational.prototype.shape;

import com.amberlion.creational.prototype.shape.shape.Shape;
import com.amberlion.creational.singleton.Singleton;
import org.junit.Assert;
import org.junit.Test;

public class PrototypeShapeTests {
    @Test
    public void testSimpleSingleton() {

        ShapeCache.loadCache();

        Shape clonedShape1 = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape: " + clonedShape1.getType());
        clonedShape1.draw();

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape: " + clonedShape2.getType());
        clonedShape2.draw();

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape: " + clonedShape3.getType());
        clonedShape3.draw();

        Assert.assertEquals("Circle", clonedShape1.getType());
        Assert.assertEquals("Square", clonedShape2.getType());
        Assert.assertEquals("Rectangle", clonedShape3.getType());
    }
}
