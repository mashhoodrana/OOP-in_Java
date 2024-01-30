import javax.swing.*;
import java.util.Scanner;

public class Neso13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++)
        {
            for (int j = i; j <= n; j++)
            {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++)
            {
                if(i == n)
                    System.out.print("*");
                else
                    if(j == 1)  //f(j == 1 || j = i)

                        System.out.print("*");
                    else
                        System.out.print(" ");




            }
            System.out.println();
        }

    }
}
