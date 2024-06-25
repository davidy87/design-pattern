package behavioral.strategy.code;

public class StrategyTest {

    private static void test() {
        System.out.println("---Strategy Pattern Test---");
        ShoppingCart cart = new ShoppingCart();

        Item itemA = new Item("itemA", 1000);
        Item itemB = new Item("itemB", 1000);

        cart.addItem(itemA);
        cart.addItem(itemB);

        // Pay with Kakao Pay
        cart.pay(new KakaoPayStrategy("test@kakao.com", "testpass!"));

        // Pay with Naver Pay
        cart.pay(new NaverPayStrategy("test@naver.com", "testpass!"));

        // Pay with KB card
        cart.pay(new KBCardStrategy("tester", "0000-1111-2222-3333", "123", "08/24"));
        System.out.println();
    }

    public static void main(String[] args) {
        test();
    }
}
