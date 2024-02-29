class tv {
    int channel = 1;
    int volume_level = 1;
    boolean on = false;

    public tv() {

    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int newChannel) {
        if (on && channel >= 1 && newChannel <= 120) {
            channel = newChannel;
        }
    }

    public void setVolume(int newVolume) {
        if (on && volume_level >= 1 && newVolume <= 120) {
            volume_level = newVolume;
        }
    }

    public void channelUP() {
        if (on && channel < 120) {
            channel++;
        }
    }

    public void channelDown() {
        if (on && channel > 1) {
            channel--;
        }
    }
}

public class Example1 {
    public static void main(String[] args) {
        tv tv = new tv();
        tv.turnOn();
        tv.setChannel(50);
        tv.channelDown();

    }
    System.out.println("The channel number is: " + tv.channel);
}
