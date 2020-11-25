package com.onixys.learning.dpc.abstractfactory.factory;

import com.onixys.learning.dpc.abstractfactory.configuration.ProductType;
import com.onixys.learning.dpc.abstractfactory.product.Product;
import com.onixys.learning.dpc.abstractfactory.product.XProductA;
import com.onixys.learning.dpc.abstractfactory.product.XProductB;
import com.onixys.learning.dpc.abstractfactory.product.XProductC;

/**
 * Product Factory - Category X
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class XProductFactory extends AbstractProductFactory {
    private Product product;

    @Override
    public Product create(ProductType type) {
        if (type.equals(ProductType.PRODUCT_A)) product = new XProductA();
        else if (type.equals(ProductType.PRODUCT_B)) product = new XProductB();
        else if (type.equals(ProductType.PRODUCT_C)) product = new XProductC();

        return product;
    }
}
