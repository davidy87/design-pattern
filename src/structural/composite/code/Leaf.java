package structural.composite.code;

public class Leaf implements Component {

    @Override
    public void execute() {
        System.out.println("This is a Leaf: " + this);
    }
}
