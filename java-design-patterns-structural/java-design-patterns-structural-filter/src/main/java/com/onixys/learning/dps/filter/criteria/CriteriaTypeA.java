package com.onixys.learning.dps.filter.criteria;

import com.onixys.learning.dps.filter.configuration.ProductType;
import com.onixys.learning.dps.filter.product.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Criteria - Product A
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class CriteriaTypeA implements Criteria {

    @Override
    public List<Product> meet(List<Product> products) {
        List<Product> aProducts = new ArrayList<>();

        for (Product product : products) {
            if(product.type().equals(ProductType.PRODUCT_A)){
                aProducts.add(product);
            }
        }
        return aProducts;
    }
}
