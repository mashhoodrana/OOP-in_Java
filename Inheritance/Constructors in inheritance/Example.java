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
        Hec uni_1 = new Hec();
        Ist uni_2 = new Ist();
        FederalUni uni_3 = new FederalUni();
    }
}
