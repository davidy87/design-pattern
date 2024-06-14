package structural.proxy.code;

public class Client {

    public static void main(String[] args) {
        SubjectInterface proxy = new Proxy(new Subject());
        proxy.action();
    }
}
