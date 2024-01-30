import java.util.Scanner;
    // video 63 exercise
public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while(true) {
            System.out.print("Enter a number between 1 and 10: ");
            n = sc.nextInt();
            if(n < 1 || n > 10)
               continue;
            System.out.print(n + " is between 1 and 10.");
            break;
        }
    }
}
