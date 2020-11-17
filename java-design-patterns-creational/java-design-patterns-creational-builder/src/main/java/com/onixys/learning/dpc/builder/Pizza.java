package com.onixys.learning.dpc.builder;

/**
 * Pizza - The Product
 *
 * @author Hamid Kianzad
 * @version {version}
 * @since 1.0.0
 */
public class Pizza {
    private String dough = "";
    private String sauce = "";
    private String topping = "";

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }
}
