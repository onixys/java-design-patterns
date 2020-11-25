package com.onixys.learning.dpc.abstractfactory.factory;

import com.onixys.learning.dpc.abstractfactory.ProductType;
import com.onixys.learning.dpc.abstractfactory.factory.AbstractProductFactory;
import com.onixys.learning.dpc.abstractfactory.product.*;

/**
 * Product Factory - Category Y
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class YProductFactory extends AbstractProductFactory {
    private Product product;

    @Override
    public Product create(ProductType type) {
        if (type.equals(ProductType.PRODUCT_A)) product = new YProductA();
        else if (type.equals(ProductType.PRODUCT_B)) product = new YProductB();
        else if (type.equals(ProductType.PRODUCT_C)) product = new YProductC();

        return product;
    }
}
