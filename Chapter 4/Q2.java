import java.util.Scanner;

public class Q2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
        double numX1 = sc.nextDouble();
        double numY1 = sc.nextDouble();

        double x1 = Math.toRadians(numX1);
        double y1 = Math.toRadians(numY1);

        System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
        double numX2 = sc.nextDouble();
        double numY2 = sc.nextDouble();

        double x2 = Math.toRadians(numX2);
        double y2 = Math.toRadians(numY2);

        double d, radius = 6371.01;
        d = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        System.out.println("The distance between the two points is " + d);
    }
}
