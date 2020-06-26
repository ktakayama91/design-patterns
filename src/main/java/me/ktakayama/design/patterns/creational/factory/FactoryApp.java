package me.ktakayama.design.patterns.creational.factory;

/**
 * Hello world!
 *
 */
public class FactoryApp
{
    private static Factory factory;

    public static void main( String[] args )
    {
        factory = getFactory("A");

        if (factory != null) {
            factory.getFactoryMessage();
            System.out.println(factory.getFactoryType());
        }

        factory = getFactory("B");

        if (factory != null) {
            factory.getFactoryMessage();
            System.out.println(factory.getFactoryType());
        }

    }

    private static Factory getFactory(String letter) {

        Factory factory;

        switch (letter) {
            case "A":
                factory =  new FactoryA();
                break;
            case "B":
                factory =  new FactoryB();
                break;
            default:
                factory = null;
                break;
        }

        return factory;
    }
}
