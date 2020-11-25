package com.onixys.learning.dps.filter.criteria;

import com.onixys.learning.dps.filter.product.Product;

import java.util.List;

/**
 * Criteria
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public interface Criteria {
    List<Product> meet(List<Product> products);
}
