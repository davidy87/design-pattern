package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeTest {

    private static void testPrototype() {
        System.out.println("--- Prototype Pattern Test ---");
        Coffee coffee = new Coffee("grande", "iced", "americano", 4_500);
        System.out.println("Original coffee: " + coffee.hashCode());

        List<Prototype> groupOrders = new ArrayList<>();
        System.out.println("Making a group order...");

        for (int i = 1; i <= 5; i++) {
            Prototype clone = coffee.clone();

            if (clone != null) {
                groupOrders.add(clone);
                System.out.println("Replicated coffee: " + clone.hashCode());
            }
        }

        System.out.println("Total 5 orders in the group order: " + (groupOrders.size() == 5));
    }

    public static void main(String[] args) {
        testPrototype();
    }
}
