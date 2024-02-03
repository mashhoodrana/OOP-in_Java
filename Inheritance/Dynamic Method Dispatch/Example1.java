// package Dynamic Method Dispatch;

class Super 
{
    protected void func1()
    {
        System.out.println("Super Method-1");
    }

    public void func2()
    {
        System.out.println("Super Method-2");
    }
}

class Sub extends Super
{
    public void func2()
    {
        System.out.println("Sub Method-2");
    }

    void func3()
   {
        System.out.println("Sub Mehtod-3");
   }

}

public class Example1 {
    public static void main(String[] args) {
        Super sp = new Sub(); //Dynamic Method Dispatch
        sp.func1();
        sp.func2();
       
    }
}
