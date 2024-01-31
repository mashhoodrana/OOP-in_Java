class rectangle {
    public double length;
    public double breadth;

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

    public boolean Square() {
        return length == breadth;
    }
}

public class RectangleTest {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.length = 45.8;
        r.breadth = 45.8;

        System.out.println("Area is: " + r.area());
        System.out.println("Perimeter is: " + r.perimeter());
        System.out.println(r.Square());
    }
}
