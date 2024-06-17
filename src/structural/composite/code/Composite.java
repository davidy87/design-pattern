package structural.composite.code;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private List<Component> components;

    public Composite() {
        components = new ArrayList<>();
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public void execute() {
        System.out.println("This is Composite: " + this);

        for (Component component : components) {
            component.execute();
        }
    }
}
