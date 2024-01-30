import java.awt.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        sayName(name);
        System.out.println("Enter your Age: ");
        int age = sc.nextInt();


        sayAge(age);

    }
    public static void sayName(String Name)
    {
        System.out.println(Name);
    }
    public static void sayAge(int Age)
    {
        System.out.println(Age);
    }


      /*Point p1 = new Point();
      p1.x = 1;
      p1.y = 2;

        System.out.println ("x = " + p1.x + " and " + "y = " + p1.y);

        change(p1);
        System.out.println ("x = " + p1.x + " and " + "y = " + p1.y);

    }
    public static void change(Point p)
    {
        p.x = 2;
        p.y = 1;
    }*/


}