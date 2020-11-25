package com.onixys.learning.dps.filter.criteria;

import com.onixys.learning.dps.filter.configuration.ProductCategory;
import com.onixys.learning.dps.filter.product.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Criteria - Category X
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class CriteriaCategoryX implements Criteria {

    @Override
    public List<Product> meet(List<Product> products) {
        List<Product> xProducts = new ArrayList<>();

        for (Product product : products) {
            if(product.category().equals(ProductCategory.CATEGORY_X)){
                xProducts.add(product);
            }
        }
        return xProducts;
    }
}
