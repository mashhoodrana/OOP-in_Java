public class practice
{
//    public static int sum(int a1, int a2)
//    {
//        int sum=0;
//        for(int i=a1; i<=a2; i++)
//        {
//            sum+=i;
//        }
//        return sum;
//    }
//
    public static int sum(int a, int b)
    {
        int result;
        if(a>b)
        {
            result = a;
        }
        else
        {
            result = b;
        }
        return result; //it goes to int k and stored in k

    }



    public static void main(String[] args)
    {
//        System.out.println("Sum from 1 to 10 is " + sum(1, 10));
//        System.out.println("Sum from 1 to 10 is " + sum(20, 35));
//        System.out.println("Sum from 1 to 10 is " + sum(35, 49));
        int i=10;
        int j=15;
        int k = sum(i, j);
        System.out.println("The maximum of " + i + " and " + j + " is " + k);
    }
}
