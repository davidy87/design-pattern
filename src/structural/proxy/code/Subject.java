package structural.proxy.code;

public class Subject implements SubjectInterface {

    @Override
    public void action() {
        System.out.println("This is Subject.");
    }
}
