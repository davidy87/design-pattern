package structural.adapter.classadapter;

public class Client {

    public static void main(String[] args) {
        ClientInterface adapter = new Adapter();
        adapter.method();
    }
}
