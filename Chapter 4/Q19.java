import java.util.Scanner;

public class Q19
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print ("Enter Nine digits: ");
        String st = sc.nextLine();
        int d1 = Character.getNumericValue(st.charAt(0));
        int d2 = Character.getNumericValue(st.charAt(1));
        int d3 = Character.getNumericValue(st.charAt(2));
        int d4 = Character.getNumericValue(st.charAt(3));
        int d5 = Character.getNumericValue(st.charAt(4));
        int d6 = Character.getNumericValue(st.charAt(5));
        int d7 = Character.getNumericValue(st.charAt(6));
        int d8 = Character.getNumericValue(st.charAt(7));
        int d9 = Character.getNumericValue(st.charAt(8));


        int checkSum = ( (d1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9) ) % 11;

        System.out.print ("The ISBN-10 Number is ");
        System.out.print (d1);
        System.out.print (d2);
        System.out.print (d3);
        System.out.print (d4);
        System.out.print (d5);
        System.out.print (d6);
        System.out.print (d7);
        System.out.print (d8);
        System.out.print (d9);

        System.out.print (checkSum==10 ? "X" : checkSum);


    }
}
