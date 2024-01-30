import java.util.Scanner;

public class Q4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print ("Enter the size of the array: ");
        int size = sc.nextInt();
        int sum=0;
        int[] num = new int[size];
        System.out.println("enter the numbers: ");
        for (int i=0; i<size; i++)
        {
            if(num[i] < 0)
            {
                break;
            }
            num[i] = sc.nextInt();
            sum += num[i];
        }

        int average = sum/size;
        System.out.println(average);

        int count=0, counter=0;
        for (int i=0; i<size; i++)
        {
            if (num[i] < average)
            {
                count++;
            }
            if (num[i] > average)
            {
                counter++;
            }
        }

        System.out.println("Number of elements above average is " + counter);
        System.out.println("Number of elements below average is " + count);



    }
}
