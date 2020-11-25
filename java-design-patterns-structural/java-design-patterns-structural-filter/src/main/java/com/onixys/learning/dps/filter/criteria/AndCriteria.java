package com.onixys.learning.dps.filter.criteria;

import com.onixys.learning.dps.filter.product.Product;

import java.util.List;

/**
 * And Criteria
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Product> meet(List<Product> products) {
        List<Product> firstCriteriaPersons = criteria.meet(products);
        return otherCriteria.meet(firstCriteriaPersons);
    }
}
