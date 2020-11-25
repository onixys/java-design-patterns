package com.onixys.learning.dpc.abstractfactory.factory;

import com.onixys.learning.dpc.abstractfactory.ProductCategory;

/**
 * Factory Creator
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class FactoryCreator {
    private static AbstractProductFactory factory;

    public static AbstractProductFactory factory(ProductCategory category) {
        if (category.equals(ProductCategory.CATEGORY_X)) factory = new XProductFactory();
        else if (category.equals(ProductCategory.CATEGORY_Y)) factory = new YProductFactory();

        return factory;
    }
}
