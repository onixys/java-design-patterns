package com.onixys.learning.dpc.abstractfactory.product;

/**
 * Product B - Category X
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class XProductB implements Product {
    @Override
    public void create() {
        System.out.println("Product B of Category X is created.");
    }
}
