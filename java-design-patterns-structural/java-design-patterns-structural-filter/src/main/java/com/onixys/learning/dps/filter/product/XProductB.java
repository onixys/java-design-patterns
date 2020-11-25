package com.onixys.learning.dps.filter.product;

import com.onixys.learning.dps.filter.configuration.ProductCategory;
import com.onixys.learning.dps.filter.configuration.ProductType;

/**
 * Product B - Category X
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class XProductB implements Product {
    @Override
    public ProductCategory category() {
        return ProductCategory.CATEGORY_X;
    }

    @Override
    public ProductType type() {
        return ProductType.PRODUCT_B;
    }

    @Override
    public String toString() {
        String detail = "Category <" + this.category().name() + "> with type <" + this.type().name() + ">";
        return "XProductB has: " + detail;
    }
}
