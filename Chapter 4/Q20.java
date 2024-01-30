import java.util.Scanner;

public class Q20
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print ("Enter a string: ");
        String st = sc.nextLine();

        int l = st.length();
        System.out.println("The length is " + l + ".");
        char ch = st.charAt(0);
        System.out.println("The first character of this string is " + ch + ".");

    }
}
