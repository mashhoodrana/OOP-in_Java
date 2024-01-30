import java.util.Scanner;

public class Method1
{
    public static void main(String[] args)
    {
        System.out.println("Enter your name and age: ");
        System.out.println(sayName() + " " + sayAge());

    }

    public static String sayName()
    {
        return new Scanner(System.in).nextLine();

    }
    public static double sayAge()
    {
        return new Scanner(System.in).nextDouble();

    }

}
