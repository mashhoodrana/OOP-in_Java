import java.util.Scanner;

public class Q3
{

    public static void reverse(int num)
    {
        int n = num;
        int digit=0;
        int rev=0;
        do{
            digit = num%10;
            rev = (rev*10) + digit;
            num = num/10;
        }
        while (num!=0);
            if (rev == n)
            {
                System.out.println("A palindrome");
            }
            else {
                System.out.println("not a palindrome");
            }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        reverse(num);
    }
}

