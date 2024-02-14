package Interfaces;


class Phone{

    void call(){
        System.out.println("Calling.............");
    }

    void sms()
    {
        System.out.println("Messaging..................");
    }

}

interface ICamera{
    void click();
    void record();
}

interface IMusicPlayer
{
    void play();
    void stop();
    void click();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer
{
    public void click()
    {
        System.out.println("Clicking..................");
    }

    public void record()
    {
        System.out.println("Recording..............");
    }

    public void play()
    {
        System.out.println("Play the Music...........");
    }

    public void stop()
    {
        System.out.println("Stop the Music...............");
    }

}

public class Example {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        Phone p = sp;
        ICamera c = sp;
        IMusicPlayer m = sp;

        sp.click();
        sp.sms();
        sp.play();

    }
}
