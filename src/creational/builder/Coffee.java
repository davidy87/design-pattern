package creational.builder;

public class Coffee {

    private final String size;

    private final String type;

    private final String name;

    private final int price;

    public Coffee(String size, String type, String name, int price) {
        this.size = size;
        this.type = type;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return size + " " + type + " " + name + " is " + price + " won.";
    }
}
