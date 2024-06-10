package creational.singleton;

public class SingletonTest {

    private static void test() {
        System.out.println("---Singleton Pattern Test---");
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();

        System.out.println("Singleton A hash code = " + a.hashCode());
        System.out.println("Singleton B hash code = " + b.hashCode());

        if (a == b) {
            System.out.println("Singleton pattern successfully implemented.");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        test();
    }
}
