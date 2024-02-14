package Interfaces;

interface Test
{
    // two abstract methods are created as interfaces contain abstract methods
    void meth1();  
    void meth2();
}

class My implements Test
{
    public void meth1()
    {
        System.out.println("Meth-1 of My class");
    }
    public void meth2()
    {
        System.out.println("Meth-2 of My class");
    }
    public void meth3()
    {
        System.out.println("Meth-3 of My class");
    }
}

public class Practice {
    public static void main(String[] args) {
       
        Test t = new My();     // Dynamic Method Dispatch, Run time polymorphism
        t.meth1();
        t.meth2();
    }
}
