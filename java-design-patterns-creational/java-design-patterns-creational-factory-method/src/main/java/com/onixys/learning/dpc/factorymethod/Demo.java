package com.onixys.learning.dpc.factorymethod;

/**
 * Demo
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class Demo {

    public static void main(String[] args) {
        ProductFactory factory = new ProductFactory();

        Product a = factory.create(ProductType.PRODUCT_A);
        a.create();

        Product b = factory.create(ProductType.PRODUCT_B);
        b.create();

        Product c = factory.create(ProductType.PRODUCT_C);
        c.create();
    }
}
