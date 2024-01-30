import java.util.Scanner;

public class Q2
{
    public static long sumDigits(long n)
    {
        long n2;
        long sum=0;

            long num = n % 10;
            n /=10;
            n %= 10;
            n2 = n/10;
            sum = num+n+n2;
        long sum1 = sum;
        return sum1;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long num = sc.nextInt();
        System.out.println(sumDigits(num));

    }
}
