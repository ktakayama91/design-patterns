package me.ktakayama.design.patterns.creational.factory;

/**
 * Hello world!
 *
 */
public class FactoryApp
{
    private static Factory factory;
    private static Product product;

    public static void main( String[] args )
    {
        factory = getFactory("A");
        if (factory != null) {
            factory.getMessage();
            product = factory.createProduct();
            System.out.println(product.getProductName());
            System.out.println(product.getProductType());
        }

        factory = getFactory("B");
        if (factory != null) {
            factory.getMessage();
            product = factory.createProduct();
            System.out.println(product.getProductName());
            System.out.println(product.getProductType());
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
