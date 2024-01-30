import java.util.Scanner;

public class Q8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println ("Enter an ASCII code: ");
        int num = sc.nextInt();

        System.out.print ("The character for ASCII code " + num + " is " + (char)num);

    }
}
