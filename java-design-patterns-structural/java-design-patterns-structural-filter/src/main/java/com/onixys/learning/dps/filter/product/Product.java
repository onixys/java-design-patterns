package com.onixys.learning.dps.filter.product;

import com.onixys.learning.dps.filter.configuration.ProductCategory;
import com.onixys.learning.dps.filter.configuration.ProductType;

/**
 * Product
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public interface Product {
    ProductCategory category();
    ProductType type();
}
