package com.onixys.learning.dpc.prototype;

/**
 * Rectangle
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class Rectangle extends Shape {

    public Rectangle(final int x, final int y, final String color) {
        super(x, y, color);
    }

    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Rectangle) || !super.equals(object2)) return false;
        Rectangle shape2 = (Rectangle) object2;
        return shape2.x == x && shape2.y == y && shape2.color == color;
    }
}
