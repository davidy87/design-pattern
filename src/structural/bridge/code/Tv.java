package structural.bridge.code;

public class Tv implements Device {

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
            System.out.println("Tv has already turned on.");
            return;
        }

        System.out.println("Tv is turned on.");
        isOn = true;
    }

    @Override
    public void turnOff() {
        if (!isOn) {
            System.out.println("Tv has already turned off.");
            return;
        }

        System.out.println("Tv is turned off.");
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
