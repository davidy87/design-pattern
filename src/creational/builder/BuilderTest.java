package creational.builder;

public class BuilderTest {

    private static void testBuilder() {
        System.out.println("--- Builder Pattern Test ---");
        Coffee coffee = CoffeeBuilder.builder()
                .type("iced")
                .name("americano")
                .size("grande")
                .price(4_500)
                .build();

        System.out.println(coffee);
    }

    public static void main(String[] args) {
        testBuilder();
    }
}
