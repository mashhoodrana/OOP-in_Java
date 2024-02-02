import java.util.Scanner;

public class Exercise5loops
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       int Max = n;
       int Min = n;

       while(true)
       {
           n = sc.nextInt();

           if(n < 0)
               break;

           if (n > Max)
               Max = n;

           if (n < Min)
               Min = n;


       }
        System.out.println("min= " + Min + ", max= " + Max);

    }
}
