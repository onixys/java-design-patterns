package com.onixys.learning.dpc.builder;

/**
 * Client
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        AbstractPizzaBuilder hawaiianPizzabuilder = new HawaiianPizzaBuilder();
        AbstractPizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder(hawaiianPizzabuilder);
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
    }
}
