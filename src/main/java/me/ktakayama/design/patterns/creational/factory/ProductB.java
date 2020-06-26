package me.ktakayama.design.patterns.creational.factory;

/**
 * @author Kei Takayama
 * Created on 6/25/20.
 */
public class ProductB implements Product {
    @Override
    public String getProductName() {
        return "I am Product B";
    }

    @Override
    public String getProductType() {
        return "My type is B";
    }
}
