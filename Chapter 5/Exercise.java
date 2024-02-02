//video 59 exercise

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        int n = sc.nextInt();
        while(n < 1 || n > 10) {
            System.out.print(n + " is not between 1 and 10 " + "Try Again: ");
            n = sc.nextInt();
        }
        System.out.println(n + " is between 1 and 10, Thanks");
    }
}
