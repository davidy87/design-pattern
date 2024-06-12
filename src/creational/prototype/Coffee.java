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
    public Coffee clone() {
        try {
            return (Coffee) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Failed to replicate coffee.");
            return null;
        }
    }
}
