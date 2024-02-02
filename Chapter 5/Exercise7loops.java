// fibonacci number (1, 1, 2, 3, 5, 8, 13......)

import java.util.Scanner;
public class Exercise7loops
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Write an integer n: ");
        int n = sc.nextInt();
        int sum = 0;
         int x = 1;
         int y = 1;
         for (int i = 1; i <= n - 2; i++)
         {
             sum = x + y;
             x = y;
             y = sum;
         }

        System.out.println("result = " + (sum == 0 ? 1 : sum));

    }
}
