package com.onixys.learning.dpc.prototype.product;

import com.onixys.learning.dpc.prototype.configuration.ProductType;

/**
 * Product
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public abstract class Product implements Cloneable {
    private String id;
    private ProductType type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public abstract void create();

    public Product clone() {
        System.out.println("Product is getting cloned.");

        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return (Product) clone;
    }
}
