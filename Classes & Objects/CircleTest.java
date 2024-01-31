class Circle {
    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double circumference() { 
        return 2 * Math.PI * radius;
    } 
}

public class CircleTest
{
    public static void main(String[] args) 
    {
        Circle c = new Circle();
        c.radius = 7;
    
        System.out.println("Area is: " + c.area());
        System.out.println("Perimeter is: " + c.perimeter());
        System.out.println("Circumference is: " + c.circumference());
    }
}
