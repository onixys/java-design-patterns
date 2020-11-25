package com.onixys.learning.dpc.abstractfactory.product;

/**
 * Product A - Category Y
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class YProductA implements Product {
    @Override
    public void create() {
        System.out.println("Product A of Category Y is created.");
    }
}
