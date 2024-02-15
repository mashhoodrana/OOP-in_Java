package Interfaces;


interface Test
{
    
    int x = 10;
    void meth1();  // interfaces methods are by default public and abstract
    void meth2();
   
    public static void meth3()    // by using static keyword method can have a body
    {
        System.out.println("Meth-3");
    }
 }

interface Test2 extends Test
{
    void meth4();
}

class My implements Test2
{
    public void meth1()
    {
        System.out.println("Meth-1");
    }
    public void meth2()
    {
        System.out.println("Meth-2");
    }
    public void meth4()
    {
        System.out.println("Meth-4");
    }
    public void meth3()
    {
        System.out.println("Meth-3 My");
    }

}

public class Practice2 {
    public static void main(String[] args) {
        My my = new My();
        my.meth1();
        my.meth2();
        my.meth3();
        my.meth4();

    }
    
}
