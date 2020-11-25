package com.onixys.learning.dpc.abstractfactory;

import com.onixys.learning.dpc.abstractfactory.configuration.ProductCategory;
import com.onixys.learning.dpc.abstractfactory.configuration.ProductType;
import com.onixys.learning.dpc.abstractfactory.factory.AbstractProductFactory;
import com.onixys.learning.dpc.abstractfactory.factory.FactoryCreator;
import com.onixys.learning.dpc.abstractfactory.product.Product;

/**
 * Demo
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class Demo {

    public static void main(String[] args) {
        // Category X
        AbstractProductFactory xFactory = FactoryCreator.factory(ProductCategory.CATEGORY_X);

        Product xa = xFactory.create(ProductType.PRODUCT_A);
        xa.create();

        Product xb = xFactory.create(ProductType.PRODUCT_B);
        xb.create();

        Product xc = xFactory.create(ProductType.PRODUCT_C);
        xc.create();

        // Category Y
        AbstractProductFactory yFactory = FactoryCreator.factory(ProductCategory.CATEGORY_Y);

        Product ya = yFactory.create(ProductType.PRODUCT_A);
        ya.create();

        Product yb = yFactory.create(ProductType.PRODUCT_B);
        yb.create();

        Product yc = yFactory.create(ProductType.PRODUCT_C);
        yc.create();
    }
}
