abstract class Shape
{
    abstract public double perimeter();
    abstract public double area();
}

class Circle extends Shape
{
    double radius=9.34;


    public double perimeter()
    {
        return 2 * Math.PI * radius;
    }

    public double area()
    {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape
{
    double length;
    double breadth;

    public double perimeter()
    {
        return 2 * (length + breadth);
    }

    public double area()
    {
        return length*breadth;
    }
}

public class Example {
    public static void main(String[] args) {
        Shape sh; //if reference is of parent class then only those method can be called which are in parent class
        sh = new Circle();
        System.out.println("Perimeter of Circle: " + sh.perimeter() + "\nArea of the Circle: "+sh.area());
        sh = new Rectangle();
        System.out.println("Perimeter of Rectangle: " + sh.perimeter() + "\nArea of the Rectangle: "+sh.area());
        
    }  
}
