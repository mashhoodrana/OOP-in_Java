import java.util.Scanner;

public class Q21

{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.print ("Enter a SSN (format is DDD-DD-DDDD): ");
        String st = sc.nextLine();

        if (st.charAt(3) == '-' && (st.charAt(6) == '-'))
        {
            System.out.print (st + " is a valid security number.");
        }
        else
        {
            System.out.print (st + " is not a valid security number.");
        }
    }
}
