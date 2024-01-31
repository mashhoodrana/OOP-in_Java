package Constructors;

class Cylinder
{
    private double radius;
    private double height;

    public double getRadius()  //for reading the data of radius
    {
        return radius;
    }

    public double getHeight() // for reading the data of height
    {
        return height;
    }

    public void setRadius(double r) //for writing the data of radius
    {
        if(r >= 0)
            radius=r;
        else
            radius=0;
    }

    public void setHeight(double h) //for writing the data of height
    {
        if (h >= 0)
            height = h;
        else
            height=0;
    }

    public void Dimensions(double r, double h)
    {
        height=h;
        radius=r;
    }

    public Cylinder() //non-parametrized constructors
    {
        radius=1;
        height=1;
    }

    public Cylinder(double r, double h)  //parametrized constructors
    {
        radius=r;
        height=h;
    }

    public Cylinder(double r) //single-parametrized constructors
    {
        radius= r;
    }

    public double lidArea()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double drumArea()
    {
        return 2*lidArea()+perimeter()*height;
    }
    public double volume()
    {
        return lidArea()*height;
    }

}

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();

        c.setHeight(10);
        c.setRadius(7);
        c.Dimensions(10, 7);
        
        System.out.println("LidArea "+c.lidArea());
        System.out.println("Circumference "+c.perimeter());
        System.out.println("totalSurfaceArea "+c.drumArea());
        System.out.println("Volume "+c.volume());
        System.out.println("Height"+c.getHeight());
        System.out.println("Radius"+c.getRadius());
    }
}
