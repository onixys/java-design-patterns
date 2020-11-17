package com.onixys.learning.dpc.builder;

/**
 * Waiter - The Director
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class Waiter {
    private AbstractPizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(AbstractPizzaBuilder pb) {
        pizzaBuilder = pb;
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

    public void constructPizza() {
        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }
}
