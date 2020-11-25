package com.onixys.learning.dpc.abstractfactory.product;

/**
 * Product A - Category X
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class XProductA implements Product {
    @Override
    public void create() {
        System.out.println("Product A of Category X is created.");
    }
}
