import factory.FactoryTest;
import singleton.SingletonTest;
import strategy.StrategyTest;

public class Main {
    public static void main(String[] args) {
        SingletonTest.test();
        FactoryTest.test();
        StrategyTest.test();
    }
}