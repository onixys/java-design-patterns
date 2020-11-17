package com.onixys.learning.dpc.builder;

/**
 * Spicy Pizza Builder - Concrete Builder
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class SpicyPizzaBuilder extends AbstractPizzaBuilder {
    @Override
    public void buildDough() {
        pizza.setDough("pan baked");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("hot");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("pepperoni+salami");
    }
}

