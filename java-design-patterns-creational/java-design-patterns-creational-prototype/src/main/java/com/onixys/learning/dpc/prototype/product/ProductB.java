package com.onixys.learning.dpc.prototype.product;

import com.onixys.learning.dpc.prototype.configuration.ProductType;

import java.util.UUID;

/**
 * Product B
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class ProductB extends Product {
    public ProductB() {
        this.setId(UUID.randomUUID().toString());
        this.setType(ProductType.PRODUCT_B);
    }

    @Override
    public void create() {
        System.out.println("Product with id <" + this.getId() + "> and type <" + this.getType() + "> is created.");
    }
}
