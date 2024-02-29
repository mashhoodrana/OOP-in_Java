class Rectangle {
    double height = 1;
    double width = 1;

    Rectangle() {

    }

    //Argument Constructor
    Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter()
    {
        return 2*(height+width);
    }
}

public class Q1 {
    public static void main(String[] args) {

        //one object of class Rectangle
        Rectangle r1 = new Rectangle(4, 40);
        System.out.println("\nThe height of r1-Rectangle is: " + r1.height);
        System.out.println("The width of r1-Rectangle is: " + r1.width);
        System.out.println("The Area of r1-Rectangle is: " + r1.getArea());
        System.out.println("The Perimeter of r1-Rectangle is: " + r1.getPerimeter());

        System.out.println("\n===========================================\n");
        //second object of class Rectangle
        Rectangle r2 = new Rectangle(3.5, 35.9);
        System.out.println("The height of r2-Rectangle is: " + r2.height);
        System.out.println("The width of r2-Rectangle is: " + r2.width);
        System.out.println("The Area of r2-Rectangle is: " + r2.getArea());
        System.out.println("The Perimeter of r2-Rectangle is: " + r2.getPerimeter());
    }
}
