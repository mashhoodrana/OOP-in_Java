import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter an amount (11.56): ");
        String amount = input.nextLine();


        String numOfOneDollars = amount.substring(0, amount.indexOf('.'));
        int cents = Integer.parseInt(amount.substring(amount.indexOf('.') + 1));


        int numOfQuarters = cents / 25;
        cents %= 25;


        int numOfDimes = cents / 10;
        cents %= 10;


        int numOfNickels = cents / 5;
        cents %= 5;

        System.out.println("Your amount " + amount + " consists of\n " + numOfOneDollars + " dollars\n " + numOfQuarters + " quarters\n " + numOfDimes + " dimes\n " + numOfNickels + " nickels\n " + cents + " pennies\n ");
    }
}
