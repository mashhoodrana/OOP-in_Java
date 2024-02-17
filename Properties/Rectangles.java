package Properties;

class Rectangle
{
    private double length; 
    private double breadth;

    public double getLength()
    {
        return length;
    }

    public double getBreadth()
    {
        return breadth; 
    }

    public void setLength(double l)
    {
        if(length >= 0)
            length=l;
        else
            length=0;
    }

    public void setBreadth(double b)
    {
        if(breadth >= 0)
            breadth=b;
        else
            breadth=0;
    }

    public double area()
    {
        return getLength()*getBreadth();
    }

    public double perimeter()
    {
        return 2 * (getLength()+getBreadth());
    }

    public boolean isSquare()
    {
        return getLength()==getBreadth();
    }


}

public class Rectangles {
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle();
        r.setLength(10);
        r.setBreadth(20);

        System.out.println("Area is: " + r.area());
        System.out.println("Perimeter is: " + r.perimeter());
        System.out.println(r.isSquare());
    }
}
