import java.util.Scanner;

public class Q4{
    public static int reverse(int num)
    {
        int digit=0;
        int rev=0;
        do{
            digit = num%10;
            rev = (rev*10) + digit;
            num = num/10;
        }
        while (num!=0);
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(reverse(n));
    }
}
