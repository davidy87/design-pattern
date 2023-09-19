package strategy;

public class StrategyTest {

    public static void test() {
        System.out.println("---Strategy Pattern Test---");
        ShoppingCart cart = new ShoppingCart();

        Item itemA = new Item("itemA", 1000);
        Item itemB = new Item("itemB", 1000);

        cart.addItem(itemA);
        cart.addItem(itemB);

        // Pay with LUNA card
        cart.pay(new LUNACardStrategy("test@gamil.com", "testpass!"));

        // Pay with KAKAO card
        cart.pay(new KAKAOCardStrategy("tester", "0000-1111-2222-3333", "123", "08/96"));
        System.out.println();
    }
}
