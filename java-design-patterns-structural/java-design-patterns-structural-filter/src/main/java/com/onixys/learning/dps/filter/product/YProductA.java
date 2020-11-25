package com.onixys.learning.dps.filter.product;

import com.onixys.learning.dps.filter.configuration.ProductCategory;
import com.onixys.learning.dps.filter.configuration.ProductType;

/**
 * Product A - Category Y
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class YProductA implements Product {
    @Override
    public ProductCategory category() {
        return ProductCategory.CATEGORY_Y;
    }

    @Override
    public ProductType type() {
        return ProductType.PRODUCT_A;
    }

    @Override
    public String toString() {
        String detail = "Category <" + this.category().name() + "> with type <" + this.type().name() + ">";
        return "YProductA has: " + detail;
    }
}
