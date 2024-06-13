package structural.bridge.code;

public class Radio implements Device {

    private boolean isOn;

    private int volumn;

    private int channel;

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void turnOn() {
        if (isOn) {
            System.out.println("Radio has already turned off.");
            return;
        }

        System.out.println("Radio is turned on.");
        isOn = true;
    }

    @Override
    public void turnOff() {
        if (!isOn) {
            System.out.println("Radio has already turned off.");
            return;
        }

        System.out.println("Radio is turned off.");
        isOn = false;
    }

    @Override
    public int getVolumn() {
        return volumn;
    }

    @Override
    public void setVolumn(int volumn) {
        if (volumn == 0) {
            System.out.println("Volumn is zero now.");
            return;
        }

        this.volumn = volumn;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }
}
