import java.util.Scanner;

public class Q14
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a letter grade: ");
        String st = sc.next();
        char ch = st.charAt(0);

        switch (ch)
        {
            case 'A':
                System.out.println("The numeric value for grade " + ch + " is " + 4);
                break;
            case 'B':
                System.out.println("The numeric value for grade " + ch + " is " + 3);
                break;
            case 'C':
                System.out.println ("The numeric value grade " + ch + " is " + 2);
                break;
            case 'D':
                System.out.println ("The numeric value grade " + ch + " is " + 1);
                break;
            case 'F':
                System.out.println ("The numeric value grade " + ch + " is " + 0);

            default:
                System.out.println(ch + " is an invalid grade");
        }

    }
}
