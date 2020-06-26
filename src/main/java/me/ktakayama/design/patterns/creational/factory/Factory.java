package me.ktakayama.design.patterns.creational.factory;

/**
 * @author Kei Takayama
 * Created on 6/25/20.
 */
public abstract class Factory {

    protected void getMessage() {
        System.out.println("I am a Factory");
    }

    public abstract Product createProduct();
}
