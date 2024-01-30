import java.util.Scanner;
public class Exercise6loops
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
        System.out.println("Write a number: ");
        int t = sc.nextInt();

        int sum = 0;
        while(t > 0)
        {
            sum = sum + t % 10;
            t = t/10;
        }
        System.out.println("sum= " + sum);


    }
}
