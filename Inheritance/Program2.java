class Cellphone
{
    public int phno;
    private double imie;

    public Cellphone() {} //Constructors

    public void setPhone(int ph)
    {
        phno=ph;
    }

    public int getPhone()
    {
        return phno;
    }

    public double getImie()
    {
        return imie;
    }

    public String call()
    {
        return "Ringing.....................";
    }

    public String sms()
    {
        return "Messaging to your friend!";
    }

    public String savedContact()
    {
        return "Contact Saved Sucessfully";
    }

    public String deleteContact()
    {
        return "Contact deleted!";
    }
}

class Smartphone extends Cellphone //Inheritance 
{
    public double Mac;

    public String play()
    {
        return "Music is playing............................";
    }

    public String click()
    {
        return "App is opening";
    }

    public String capture()
    {
        return "Photo is captured!";
    }
}

public class Program2 {
    public static void main(String[] args) {
        Cellphone cp = new Cellphone();
        cp.setPhone(99191);
        System.out.println(cp.getPhone());

        Smartphone sp = new Smartphone();
        System.out.println(sp.call());
        System.out.println(sp.sms());
        System.out.println(sp.savedContact());
        System.out.println(sp.deleteContact());
        System.out.println(sp.play());
       
    }
}
