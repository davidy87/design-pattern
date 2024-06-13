package structural.adapter.classadapter;

public class Adapter extends Service implements ClientInterface {

    @Override
    public void method() {
        serviceMethod();
    }
}
