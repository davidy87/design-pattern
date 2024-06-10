package creational.factory;

import creational.factory.product.Coffee;
import creational.factory.pattern.AbstractFactory;
import creational.factory.pattern.FactoryMethod;

import static creational.factory.pattern.Factory.*;

public class FactoryTest {

    private static void factoryTest() {
        System.out.println("---Factory Pattern Test---");
        Coffee americano = CoffeeFactory.orderCoffee("Americano");
        Coffee latte = CoffeeFactory.orderCoffee("Latte");
        printResult(americano, latte);
    }

    private static void factoryMethodTest() {
        System.out.println("--- Factory Method Pattern Test ---");
        FactoryMethod.CoffeeFactory americanoFactory = new FactoryMethod.AmericanoFactory();
        FactoryMethod.CoffeeFactory latteFactory = new FactoryMethod.LatteFactory();
        printResult(americanoFactory.orderCoffee(), latteFactory.orderCoffee());
    }

    private static void abstractFactoryTest() {
        System.out.println("--- Abstract Factory Pattern Test ---");
        AbstractFactory.CoffeeFactory americanoFactory = new AbstractFactory.AmericanoFactory();
        AbstractFactory.CoffeeFactory latteFactory = new AbstractFactory.LatteFactory();
        printResult(americanoFactory.orderHot(), latteFactory.orderHot());
        printResult(americanoFactory.orderIced(), latteFactory.orderIced());
    }

    private static void printResult(Coffee americano, Coffee latte) {
        System.out.println("Factory americano ::" + americano);
        System.out.println("Factory latte ::" + latte);
        System.out.println();
    }

    public static void main(String[] args) {
        factoryTest();
        factoryMethodTest();
        abstractFactoryTest();
    }
}
