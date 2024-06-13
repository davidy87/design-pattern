package structural.bridge.code;

public class Remote {

    private final Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void power() {
        if (device.isOn()) {
            device.turnOff();
        } else {
            device.turnOn();
        }
    }

    public void volumnUp() {
        device.setVolumn(device.getVolumn() + 1);
    }

    public void volumnDown() {
        device.setVolumn(device.getVolumn() - 1);
    }

    public void channelUp() {
        device.setChannel(device.getChannel() + 1);
    }

    public void channelDown() {
        device.setChannel(device.getChannel() - 1);
    }
}
