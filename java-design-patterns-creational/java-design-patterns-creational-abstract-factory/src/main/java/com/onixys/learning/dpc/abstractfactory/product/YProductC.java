package com.onixys.learning.dpc.abstractfactory.product;

/**
 * Product C - Category Y
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class YProductC implements Product {
    @Override
    public void create() {
        System.out.println("Product C of Category Y is created.");
    }
}
