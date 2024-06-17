package structural.composite.code;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        Composite rootComposite = new Composite();

        Leaf leaf1 = new Leaf();
        Composite subComposite = new Composite();

        rootComposite.addComponent(leaf1);
        rootComposite.addComponent(subComposite);

        List<Leaf> subLeaves = List.of(new Leaf(), new Leaf());
        subLeaves.forEach(subComposite::addComponent);

        rootComposite.execute();
    }
}
