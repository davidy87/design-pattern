package creational.factory.pattern;

import creational.factory.product.Coffee;

public class Factory {

    public static class CoffeeFactory {

        private static final String AMERICANO = "Americano";

        private static final String LATTE = "Latte";

        public static Coffee orderCoffee(String name) {
            return makeCoffee(name);
        }

        private static Coffee makeCoffee(String name) {
            if (AMERICANO.equalsIgnoreCase(name)) {
                return new Americano();
            }

            if (LATTE.equalsIgnoreCase(name)) {
                return new Latte();
            }

            return new HouseCoffee();
        }
    }

    public static class HouseCoffee extends Coffee {

        @Override
        public int getPrice() {
            return 3_000;
        }
    }

    public static class Americano extends Coffee {

        @Override
        public int getPrice() {
            return 4_000;
        }
    }

    public static class Latte extends Coffee {

        @Override
        public int getPrice() {
            return 4_500;
        }
    }
}
