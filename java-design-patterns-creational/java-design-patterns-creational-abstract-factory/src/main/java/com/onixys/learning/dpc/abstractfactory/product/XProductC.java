package com.onixys.learning.dpc.abstractfactory.product;

/**
 * Product C - Category X
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class XProductC implements Product {
    @Override
    public void create() {
        System.out.println("Product C of Category X is created.");
    }
}
