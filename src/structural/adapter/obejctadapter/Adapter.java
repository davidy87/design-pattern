package structural.adapter.obejctadapter;

public class Adapter implements ClientInterface {

    private final Service service;

    public Adapter(Service service) {
        this.service = service;
    }

    @Override
    public void method() {
        this.service.serviceMethod();
    }
}
