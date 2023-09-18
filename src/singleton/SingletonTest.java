package singleton;

public class SingletonTest {

    public static void test() {
        System.out.println("---Singleton Pattern Test---");
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();

        System.out.println("Singleton a hash code = " + a.hashCode());
        System.out.println("Singleton b hash code = " + b.hashCode());

        if (a == b) {
            System.out.println("Singleton pattern successfully implemented.");
        }

        System.out.println();
    }
}
