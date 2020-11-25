package com.onixys.learning.dpc.factorymethod.product;

/**
 * Product C
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class ProductC implements Product {
    @Override
    public void create() {
        System.out.println("Product C is created.");
    }
}
