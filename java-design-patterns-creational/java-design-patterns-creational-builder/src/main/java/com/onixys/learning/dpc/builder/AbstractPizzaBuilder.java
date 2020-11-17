package com.onixys.learning.dpc.builder;

/**
 * Abstract Pizza Builder - Abstract Builder
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public abstract class AbstractPizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createNewPizzaProduct() {
        pizza = new Pizza();
    }

    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildTopping();
}
