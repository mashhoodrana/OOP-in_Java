import java.util.Scanner;

public class Q1
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print ("Enter the length: ");
        double r = sc.nextDouble();

        double s = (2 * r) * Math.sin(Math.PI / 5);
        double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));


        System.out.println ("The area of the pentagon is " + area);







    }
}
