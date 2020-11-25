package com.onixys.learning.dpc.factorymethod.product;

/**
 * Product B
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class ProductB implements Product {
    @Override
    public void create() {
        System.out.println("Product B is created.");
    }
}
