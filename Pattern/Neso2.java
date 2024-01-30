import java.util.Scanner;

public class Neso2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 1; i <= t; i++)
        {
            if(i == 1 || i == t)
                for(int j = 1; j <= t; j++);
                    System.out.println("*");
                    else
                        for (int i = 1; i <= t; i++)
                            if(j == 1 || j == t)
            {
                System.out.print("*");

            }
            System.out.println();

        }

    }
}
