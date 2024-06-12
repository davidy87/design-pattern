package creational.builder;

public class CoffeeBuilder {

    private String type;

    private String name;

    private String size;

    private int price;

    private CoffeeBuilder() {
    }

    public static CoffeeBuilder builder() {
        return new CoffeeBuilder();
    }

    public CoffeeBuilder type(String type) {
        this.type = type;
        return this;
    }

    public CoffeeBuilder name(String name) {
        this.name = name;
        return this;
    }

    public CoffeeBuilder size(String size) {
        this.size = size;
        return this;
    }

    public CoffeeBuilder price(int price) {
        this.price = price;
        return this;
    }

    public Coffee build() {
        return new Coffee(type, name, size, price);
    }
}
