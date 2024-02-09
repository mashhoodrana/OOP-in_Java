abstract class Shapes
{
    abstract public double area();
    abstract public double perimeter();
}

class Circle extends Shapes
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

public class Example1 {
    public static void main(String[] args) {
        Shapes sh; //if reference is of parent class then only those method can be called which are in parent class
        sh = new Circle();
        System.out.println("Perimeter of Circle: " + sh.perimeter() + "\nArea of the Circle: "+sh.area());
        
    }  
}