package com.onixys.learning.dps.filter.product;

import com.onixys.learning.dps.filter.configuration.ProductCategory;
import com.onixys.learning.dps.filter.configuration.ProductType;

/**
 * Product C - Category X
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class XProductC implements Product {
    @Override
    public ProductCategory category() {
        return ProductCategory.CATEGORY_X;
    }

    @Override
    public ProductType type() {
        return ProductType.PRODUCT_C;
    }

    @Override
    public String toString() {
        String detail = "Category <" + this.category().name() + "> with type <" + this.type().name() + ">";
        return "XProductC has: " + detail;
    }
}
