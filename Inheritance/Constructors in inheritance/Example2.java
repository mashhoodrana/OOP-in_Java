import java.nio.file.FileStore;

class Hec
{
    public Hec()
    {
        System.out.println("Higher Education Commission!");
    }

    public Hec(int a)
    {
        System.out.println("Parent"+a);
    }
}

class FederalUni extends Hec
{
    public FederalUni()
    {
        System.out.println("Islamabad Universities");
    }

    public FederalUni(int b)
    {
        System.out.println("Param Child");
    }

    public FederalUni(int a, int b) //to call the parametrized constructors of parent class super is used..
    {
        super(a); 
        System.out.println("Child "+b);
    }
}



public class Example2 {
    public static void main(String[] args)
    {
        FederalUni u1 = new FederalUni();
        FederalUni u2 = new FederalUni(1000);
        FederalUni u3 = new FederalUni(20, 10);
    }
}

