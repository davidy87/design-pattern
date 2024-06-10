package creational.factory.pattern;

import creational.factory.product.Coffee;

public class FactoryMethod {

    public static class AmericanoFactory extends CoffeeFactory {

        @Override
        protected final Coffee makeCoffee() {
            return new Americano();
        }
    }

    public static class LatteFactory extends CoffeeFactory {

        @Override
        protected final Coffee makeCoffee() {
            return new Latte();
        }
    }

    public abstract static class CoffeeFactory {

        public Coffee orderCoffee() {
            return makeCoffee();
        }

        protected abstract Coffee makeCoffee();
    }

    public static class Latte extends Coffee {

        @Override
        public int getPrice() {
            return 4_500;
        }
    }

    public static class Americano extends Coffee {

        @Override
        public int getPrice() {
            return 4_000;
        }
    }
}
