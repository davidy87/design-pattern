package creational.factory.product;

public abstract class Coffee {

    public abstract int getPrice();

    public String getName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "The price of " + getName() + " is " + getPrice() + ".";
    }
}
