class Rectangle
{
    int length;
    int breadth;

    public Rectangle() 
    {
        length=breadth=1;
    }

    public Rectangle(int len, int bre)
    {
        length=len;
        breadth=bre;
    }
}

class Cuboid extends Rectangle
{
    int height;

    public Cuboid()
    {
        height=1;
    }

    public Cuboid(int hei)
    {
        height=hei;
    }

    public Cuboid (int l, int b, int h) 
    {
        super(l, b); //go to the parent constructor 
        height=h;
    }


    public double volume()
    {
        return length*breadth*height;
    }


    
}

public class Example3 {
    public static void main(String[] args)
    {
        Cuboid c1 = new Cuboid();           //non-param constructor of parnet executed first, then non-param of child
        System.out.println("" + c1.volume());

        Cuboid c2 = new Cuboid(20);     //non-param constructor of parnet executed first, then one-param of child
        System.err.println(c2.volume());

        Cuboid c3 = new Cuboid(10, 10, 10);   //param constructor of parnet executed first, then three-param of child constructor
        System.out.println(c3.volume());

        
        
    }
}
