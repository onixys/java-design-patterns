package com.onixys.learning.dpc.factorymethod.factory;

import com.onixys.learning.dpc.factorymethod.configuration.ProductType;
import com.onixys.learning.dpc.factorymethod.product.Product;
import com.onixys.learning.dpc.factorymethod.product.ProductA;
import com.onixys.learning.dpc.factorymethod.product.ProductB;
import com.onixys.learning.dpc.factorymethod.product.ProductC;

/**
 * Product Factory
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class ProductFactory {
    private Product product;

    public Product create(ProductType type) {
        if (type.equals(ProductType.PRODUCT_A)) product = new ProductA();
        else if (type.equals(ProductType.PRODUCT_B)) product = new ProductB();
        else if (type.equals(ProductType.PRODUCT_C)) product = new ProductC();

        return product;
    }
}
