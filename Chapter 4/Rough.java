import java.util.Scanner;
public class Rough
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
                boolean flag = true;
                for (int j=2; j<i; j++)
                {
                    if (i%j==0)
                    {
                        flag = false;
                        break;
                    }
                }
                if (flag == true)
                {
                    System.out.println(i);
                }
            }

        }

    }
}
