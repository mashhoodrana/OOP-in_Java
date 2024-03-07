class Rectangle
{
    int length;
    int breadth;
    int a=20;

    Rectangle () {}

    Rectangle(int length, int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }

    public void display()
    {
        System.out.println("length: " + length);
        System.out.println("breadth: " + breadth);
    }
}

class Cuboid extends Rectangle
{
    int height;
    int a=70;

    Cuboid (int l, int b, int h)
    {
        length=l;
        breadth=b;
        height=h;
    }

    void display1()
    {
        System.out.println(super.a);
        System.out.println(a);
    }

}

public class Example4 {
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle(10, 20);
        r1.display();

        Cuboid c1 = new Cuboid(10, 10, 10);
        c1.display1();
    }
}

