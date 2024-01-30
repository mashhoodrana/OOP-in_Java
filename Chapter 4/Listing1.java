import java.util.Scanner;

public class Listing1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Enter the coordinates of three points: ");
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();

            double a = Math.sqrt ((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
            double b = Math.sqrt ((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
            double c = Math.sqrt ((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));


        }
    }

}
