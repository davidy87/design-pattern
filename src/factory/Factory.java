package factory;

public class Factory {

    public abstract static class Coffee {
        public abstract int getPrice();

        @Override
        public String toString() {
            return "The price of this coffee is " + this.getPrice();
        }
    }

    public static class CoffeeFactory {

        private static final String LATTE = "Latte";

        private static final String AMERICANO = "Americano";

        public static Coffee getCoffee(String type, int price) {
            if (type.equalsIgnoreCase(LATTE)) {
                return new Latte(price);
            }

            if (type.equalsIgnoreCase(AMERICANO)) {
                return new Americano(price);
            }

            return new DefaultCoffee();
        }
    }

    public static class DefaultCoffee extends Coffee {

        private int price;

        public DefaultCoffee() {
            this.price = 0;
        }

        @Override
        public int getPrice() {
            return this.price;
        }
    }

    public static class Americano extends Coffee {

        private int price;

        public Americano(int price) {
            this.price = price;
        }

        @Override
        public int getPrice() {
            return this.price;
        }
    }

    public static class Latte extends Coffee {

        private int price;

        public Latte(int price) {
            this.price = price;
        }

        @Override
        public int getPrice() {
            return this.price;
        }
    }
}
