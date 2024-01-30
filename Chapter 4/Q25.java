public class Q25
{
    public static void main(String[] args)
    {


        int digit1 = 65 + (int) (Math.random() * (90 - 65));
        int digit2 = 65 + (int) (Math.random() * (90 - 65));
        int digit3 = 65 + (int) (Math.random() * (90 - 65));


        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int number3 = (int) (Math.random() * 10);
        int number4 = (int) (Math.random() * 10);


        System.out.println(("" + (char) (digit1) + ((char) digit2)) + ((char) (digit3)) + number1 + number2 + number3 + number4);
    }
}
