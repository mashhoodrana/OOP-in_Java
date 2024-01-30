import java.util.Scanner;

public class Q3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.print ("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] num = new int[size];

        System.out.print ("Enter integer between 1 and 100: ");
        for (int i=0; i<size; i++)
        {
            num[i] = sc.nextInt();
        }


        for (int i=0; i<size; i++)
        {
            if (num[i] > 0)
            {
                System.out.println("");
            }
        }
    }

}
