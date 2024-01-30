import java.util.Scanner;
public class Prime
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        {
            System.out.print ("Enter the starting number of prime number: ");
            int num1 = sc.nextInt();
            System.out.print ("Enter the ending number: ");
            int num2 = sc.nextInt();

            for (int i=num1; i<=num2; i++)
            {
                for (int j=2; j<=num2; j++)
                {
                    if (i%j==0)
                    {
                        break;
                    }
                    else if (i == j+1)
                    {
                        System.out.println (i);
                    }
                }
            }

        }

    }
}
