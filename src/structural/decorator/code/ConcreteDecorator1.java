package structural.decorator.code;

public class ConcreteDecorator1 implements Decorator {

    private final Component component;

    public ConcreteDecorator1(Component component) {
        this.component = component;
    }

    @Override
    public void method() {
        System.out.println("Entering ConcreteDecorator1...");
        component.method();
        extraMethod();
    }

    private void extraMethod() {
        System.out.println("Executing ConcreteDecorator1 extra operation...");
    }
}
