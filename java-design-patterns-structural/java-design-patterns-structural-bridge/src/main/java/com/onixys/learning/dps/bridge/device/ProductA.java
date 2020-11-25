package com.onixys.learning.dps.bridge.device;

/**
 * ProductA
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class ProductA implements Product {
    @Override
    public void create() {
        System.out.println("Product A is created.");
    }
}
