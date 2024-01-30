import java.util.Scanner;

public class Q5
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print ("Enter the number of sides: ");
        int numOfSides = input.nextInt();
        System.out.print ("Enter the side: ");
        double side = input.nextDouble();

        double area = (numOfSides * Math.pow(side, 2) / (4 * Math.tan(Math.PI / numOfSides)));

        System.out.println ("The area of the polygon is " + area);
    }
}

