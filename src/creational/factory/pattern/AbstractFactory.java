package creational.factory.pattern;

import creational.factory.product.Coffee;

public class AbstractFactory {

    public static class AmericanoFactory extends CoffeeFactory {

        @Override
        protected HotCoffee makeHotCoffee() {
            return new HotAmericano();
        }

        @Override
        protected IcedCoffee makeIcedCoffee() {
            return new IcedAmericano();
        }
    }

    public static class LatteFactory extends CoffeeFactory {

        @Override
        protected HotCoffee makeHotCoffee() {
            return new HotLatte();
        }

        @Override
        protected IcedCoffee makeIcedCoffee() {
            return new IcedLatte();
        }
    }

    public abstract static class CoffeeFactory {

        public Coffee orderHot() {
            return makeHotCoffee();
        }

        public Coffee orderIced() {
            return makeIcedCoffee();
        }

        protected abstract HotCoffee makeHotCoffee();

        protected abstract IcedCoffee makeIcedCoffee();
    }

    public static class IcedLatte extends IcedCoffee {

        @Override
        public int getPrice() {
            return 4_500;
        }
    }

    public static class HotLatte extends HotCoffee {

        @Override
        public int getPrice() {
            return 4_000;
        }
    }

    public static class IcedAmericano extends IcedCoffee {

        @Override
        public int getPrice() {
            return 4_000;
        }
    }

    public static class HotAmericano extends HotCoffee {

        @Override
        public int getPrice() {
            return 3_500;
        }
    }

    public abstract static class IcedCoffee extends Coffee {
    }

    public abstract static class HotCoffee extends Coffee {
    }
}
