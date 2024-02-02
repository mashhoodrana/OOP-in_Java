
// Video 58 exercise
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter four digit number; ");
        int x  = sc.nextInt();
        int fourthDigit = x % 10;
        int thirdDigit = (x / 10) % 10;
        int secondDigit = (x / 100) % 10;
        int firstDigit = (x / 1000) % 10;

        if(firstDigit + secondDigit == thirdDigit + fourthDigit)
            System.out.println("This is a Lucky nnumber");
        else
            System.out.println("This is not a Lucky Number");






    }


}