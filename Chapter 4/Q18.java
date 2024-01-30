import java.util.Scanner;

public class Q18
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print ("Enter two characters: ");
        String st = sc.nextLine();
        char ch = st.charAt(0);
        char ch2 = st.charAt(1);

        String ans = "";

        if (st.length() != 2)
        {
            ans = "Invalid Input";
        }
        else if( (ch=='M' || ch=='C' || ch=='I') && (ch2>='1' && ch2<='4') )
        {
            if (ch =='M')
            {
                ans += "Mathematics ";
            }
            else if (ch =='C')
            {
                ans += "Computer Science ";
            }
            else
            {
                ans += "Information Technology ";
            }

            if (ch2=='1')
            {
                ans += "Freshman";
            }
            else if (ch2=='2')
            {
                ans += "Sophomore";
            }
            else if (ch2 == '3')
            {
                ans += "Junior";
            }
            else
            {
                ans += "Senior";
            }
        }
        else
        {
            ans += "Invalid Input";
        }

        System.out.println (ans);

        sc.close();
    }
}