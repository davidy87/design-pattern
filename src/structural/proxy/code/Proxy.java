package structural.proxy.code;

public class Proxy implements SubjectInterface {

    private final SubjectInterface subject;

    public Proxy(SubjectInterface subject) {
        this.subject = subject;
    }

    @Override
    public void action() {
        System.out.println("Calling Proxy...");
        subject.action();
    }
}
