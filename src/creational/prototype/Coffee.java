package creational.prototype;

public class Coffee implements Prototype {

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
    public Prototype clone() {
        return new Coffee(size, type, name, price);
    }
}
