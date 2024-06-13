package structural.bridge.code;

public interface Device {

    boolean isOn();

    void turnOn();

    void turnOff();

    int getVolumn();

    void setVolumn(int volumn);

    int getChannel();

    void setChannel(int channel);
}
