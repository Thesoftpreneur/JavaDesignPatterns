package com.amberlion.creational.prototype.shape.shape;

import lombok.Getter;
import lombok.Setter;

public abstract class Shape implements Cloneable {
    @Getter
    @Setter
    private String id;
    @Getter
    protected String type;

    public abstract void draw();

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
