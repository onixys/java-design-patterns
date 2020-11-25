package com.onixys.learning.dps.filter;

import com.onixys.learning.dps.filter.criteria.*;
import com.onixys.learning.dps.filter.product.Product;
import com.onixys.learning.dps.filter.product.XProductA;
import com.onixys.learning.dps.filter.product.XProductB;

import java.util.ArrayList;
import java.util.List;

/**
 * Demo
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class Demo {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new XProductA());
        products.add(new XProductB());

        Criteria categoryX = new CriteriaCategoryX();
        Criteria typeA = new CriteriaTypeA();
        Criteria typeB = new CriteriaTypeB();
        Criteria XAndA = new AndCriteria(categoryX, typeA);
        Criteria XOrB = new OrCriteria(categoryX, typeB);

        System.out.println(categoryX.meet(products));
        System.out.println(XAndA.meet(products));
        System.out.println(XOrB.meet(products));
    }
}
