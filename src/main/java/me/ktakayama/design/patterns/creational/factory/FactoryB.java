package me.ktakayama.design.patterns.creational.factory;

/**
 * @author Kei Takayama
 * Created on 6/25/20.
 */
public class FactoryB extends Factory {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
