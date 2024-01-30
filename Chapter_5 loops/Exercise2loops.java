import java.util.Scanner;
public class Exercise2loops
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int n = 0;
      do
      {
           System.out.print("Write a sequence of integer: ");
            n += sc.nextInt();


       }  while(n<=100);
        System.out.println("Done " + n);





    }
}
