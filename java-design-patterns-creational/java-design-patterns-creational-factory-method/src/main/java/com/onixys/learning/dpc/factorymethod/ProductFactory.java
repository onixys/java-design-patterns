package com.onixys.learning.dpc.factorymethod;

/**
 * Product Factory
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class ProductFactory {
    private Product product;

    public Product create(ProductType type) {
        if (type.equals(ProductType.PRODUCT_A)) product = new ProductA();
        else if (type.equals(ProductType.PRODUCT_B)) product = new ProductB();
        else if (type.equals(ProductType.PRODUCT_C)) product = new ProductC();

        return product;
    }
}
