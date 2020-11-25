package com.onixys.learning.dpc.abstractfactory.factory;

import com.onixys.learning.dpc.abstractfactory.configuration.ProductType;
import com.onixys.learning.dpc.abstractfactory.product.Product;

/**
 * Abstract Product Factory
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public abstract class AbstractProductFactory {
    public abstract Product create(ProductType type);
}
