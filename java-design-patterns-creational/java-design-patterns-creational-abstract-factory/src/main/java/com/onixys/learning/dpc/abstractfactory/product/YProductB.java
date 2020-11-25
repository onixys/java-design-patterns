package com.onixys.learning.dpc.abstractfactory.product;

/**
 * Product B - Category Y
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class YProductB implements Product {
    @Override
    public void create() {
        System.out.println("Product B of Category Y is created.");
    }
}
