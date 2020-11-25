package com.onixys.learning.dpc.prototype;

import java.util.Objects;

/**
 * Shape
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public abstract class Shape {
    protected int x;
    protected int y;
    protected String color;

    public Shape(final int x, final int y, final String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape)) return false;
        Shape shape2 = (Shape) object2;
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
    }
}
