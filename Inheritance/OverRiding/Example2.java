package OverRiding;


class Mehran 
{
    public void switchOn() {System.out.println("Mehran is unlocked! ");}
    public void changeGear() {System.out.println("Mehran's gear is changing");}
}

class Vitz extends Mehran
{
    public void switchOn() {System.out.println("Vitz is unlocled! ");}   //OverRiding
    public void changeGear() {System.out.println("Vitz gear is changing");} //OverRiding
    public void handBrake() {System.out.println("Vitz has no handbrake! ");}
}

public class Example2 {
    public static void main(String[] args) {
        Mehran mhn = new Mehran();
        mhn.switchOn();
        mhn.changeGear();
        
        Vitz vz = new Vitz();
        vz.switchOn();
        vz.changeGear();

        Mehran car = new Vitz(); //dynamic method dispatch
        car.switchOn();
        car.changeGear();
    }
}
