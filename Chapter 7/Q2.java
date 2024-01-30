import java.util.Scanner;

public class Q2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] num = new int[size];
        System.out.println("Enter " + size + " integers: ");
        for (int i=0; i<size; i++)
        {
            num[i] = sc.nextInt();
        }

        System.out.print ("The reverse order of the integer is: ");
        for (int i=size-1; i>=0; i--)
        {
            System.out.print (num[i] + " ");
        }

    }

}
