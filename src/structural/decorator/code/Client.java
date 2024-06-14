package structural.decorator.code;

public class Client {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();

        System.out.println("--- Decorator1 ---");
        Component decorator1 = new ConcreteDecorator1(component);
        decorator1.method();
        System.out.println();

        System.out.println("--- Decorator2 ---");
        Component decorator2 = new ConcreteDecorator2(component);
        decorator2.method();
        System.out.println();

        System.out.println("--- Decorator1 + Decorator2 ---");
        Component decorator3 = new ConcreteDecorator1(new ConcreteDecorator2(component));
        decorator3.method();
    }
}
