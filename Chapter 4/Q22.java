import java.util.Scanner;

public class Q22
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter string s1: ");
        String s1 = sc.nextLine();
        System.out.print ("Enter string s2: ");
        String s2 = sc.nextLine();

        if (s1.substring(0) == s2.substring(0) || s1.substring(1) == s2.substring(1) || s1.substring(2)==s2.substring(2) || s1.substring(3)==s2.substring(3))
        {
            System.out.println(s2 + "is a substring of " + s1);
        }
        else
        {
            System.out.println(s2 + "is not a substring of " + s1);
        }
    }
}
