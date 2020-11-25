package com.onixys.learning.dpc.prototype;

import com.onixys.learning.dpc.prototype.factory.CloneFactory;
import com.onixys.learning.dpc.prototype.product.Product;
import com.onixys.learning.dpc.prototype.product.ProductA;

/**
 * Demo
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class Demo {
    public static void main(String[] args) {
        CloneFactory factory = new CloneFactory();

        Product productA = new ProductA();
        Product cloneProductA = factory.clone(productA);

        productA.create();
        cloneProductA.create();

        System.out.println("Product A Hashcode: " + System.identityHashCode(productA));
        System.out.println("Clone ProductA A Hashcode: " + System.identityHashCode(cloneProductA));
    }
}
