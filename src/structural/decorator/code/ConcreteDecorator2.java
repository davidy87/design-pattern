package structural.decorator.code;

public class ConcreteDecorator2 implements Decorator {

    private final Component component;

    public ConcreteDecorator2(Component component) {
        this.component = component;
    }

    @Override
    public void method() {
        System.out.println("Entering ConcreteDecorator2...");
        component.method();
        extraMethod();
    }

    private void extraMethod() {
        System.out.println("Executing ConcreteDecorator2 extra operation...");
    }
}
