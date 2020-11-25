package com.onixys.learning.dpc.prototype.product;

import com.onixys.learning.dpc.prototype.configuration.ProductType;

import java.util.UUID;

/**
 * Product C
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class ProductC extends Product {
    public ProductC() {
        this.setId(UUID.randomUUID().toString());
        this.setType(ProductType.PRODUCT_C);
    }

    @Override
    public void create() {
        System.out.println("Product with id <" + this.getId() + "> and type <" + this.getType() + "> is created.");
    }
}
