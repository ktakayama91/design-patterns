package me.ktakayama.design.patterns.creational.factory;

/**
 * @author Kei Takayama
 * Created on 6/25/20.
 */
abstract class Factory {

    protected String letter;

    abstract String getLetter();

    public void test() {
        System.out.println("This is an abstract class named Factory");
    }
}
