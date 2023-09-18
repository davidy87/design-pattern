package factory;

import static factory.Factory.*;

public class FactoryTest {

    public static void test() {
        System.out.println("---Factory Pattern Test---");
        Coffee latte = CoffeeFactory.getCoffee("Latte", 4000);
        Coffee americano = CoffeeFactory.getCoffee("Americano", 3000);

        System.out.println("Factory latte ::" + latte);
        System.out.println("Factory americano ::" + americano);
        System.out.println();
    }
}
