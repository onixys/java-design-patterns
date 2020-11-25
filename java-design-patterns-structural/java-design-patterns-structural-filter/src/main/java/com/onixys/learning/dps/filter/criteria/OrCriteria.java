package com.onixys.learning.dps.filter.criteria;

import com.onixys.learning.dps.filter.product.Product;

import java.util.List;

/**
 * Or Criteria
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Product> meet(List<Product> products) {
        List<Product> firstCriteriaItems = criteria.meet(products);
        List<Product> otherCriteriaItems = otherCriteria.meet(products);

        for (Product product : otherCriteriaItems) {
            if(!firstCriteriaItems.contains(product)){
                firstCriteriaItems.add(product);
            }
        }
        return firstCriteriaItems;
    }
}
