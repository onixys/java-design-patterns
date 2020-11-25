package com.onixys.learning.dps.filter.criteria;

import com.onixys.learning.dps.filter.configuration.ProductType;
import com.onixys.learning.dps.filter.product.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Criteria - Product B
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class CriteriaTypeB implements Criteria {

    @Override
    public List<Product> meet(List<Product> products) {
        List<Product> bProducts = new ArrayList<>();

        for (Product product : products) {
            if(product.category().equals(ProductType.PRODUCT_B)){
                bProducts.add(product);
            }
        }
        return bProducts;
    }
}
