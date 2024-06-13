package structural.bridge.code;

public class Client {

    public static void main(String[] args) {
        Remote tvRemote = new Remote(new Tv());
        Remote radioRemote = new Remote(new Radio());

        tvRemote.power();
        tvRemote.volumnUp();
        tvRemote.power();

        radioRemote.power();
        radioRemote.volumnUp();
        radioRemote.volumnDown();
        radioRemote.volumnDown();
        radioRemote.power();
    }
}
