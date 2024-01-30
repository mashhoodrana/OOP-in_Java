//Video 61 exercise

import java.util. Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter a number between 1 and 10: ");
            n = sc.nextInt();
        } while(n < 1 || n > 10 );
        System.out.println(n + " is between 1 and 10.");
    }
}
