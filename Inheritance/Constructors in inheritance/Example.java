class Hec
{
    public Hec()
    {
        System.out.println("Higher Education Commission!");
    }
}

class FederalUni extends Hec
{
    public FederalUni()
    {
        System.out.println("Islamabad Universities");
    }
}

class Ist extends FederalUni
{
    public Ist()
    {
        System.out.println("Institute of Space and Technology");
    }
}

public class Example {
    public static void main(String[] args)
    {
        Ist uni = new Ist();
    }
}
