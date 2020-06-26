package me.ktakayama.design.patterns.creational.factory;

/**
 * @author Kei Takayama
 * Created on 6/25/20.
 */
abstract class Factory {

    protected String type;

    abstract String getFactoryType();

    public void getFactoryMessage() {
        System.out.println("This is method comes from an abstract class named Factory");
    }
}
