import java.util.Scanner;
public class Exercise4loops {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number N: ");
        int n = sc.nextInt();

        int mySum = 0;
        for (int i =1; i<=n; i++)
        {
            if (n%i == 0)
            {
                mySum += i;
                System.out.println(mySum);
            }
        }

        if (mySum == 1+n)
        {
            System.out.println ("Given number is a Prime number.");
        }
        else
        {
            System.out.println ("Given number is Not a prime number.");
        }
    }
}
