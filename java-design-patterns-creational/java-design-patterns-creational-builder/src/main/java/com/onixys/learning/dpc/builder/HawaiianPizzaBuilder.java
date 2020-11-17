package com.onixys.learning.dpc.builder;

/**
 * Hawaiian Pizza Builder - Concrete Builder
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class HawaiianPizzaBuilder extends AbstractPizzaBuilder {
    @Override
    public void buildDough() {
        pizza.setDough("cross");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("mild");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("ham+pineapple");
    }
}
