import java.util.Scanner;

public class Q1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int std = sc.nextInt();

        char grade=0;
        System.out.println("Enter" + std + "scores: ");
        int[] marks = new int[4];
        for (int i=0; i<std; i++)
        {
            marks[i] = sc.nextInt();
        }

        for(int i=0; i<std; i++)
        {
            if (marks[i] >= 70)
            {
                grade = 'A';
            }

            if (marks[i] >= 50 && marks[i] < 70)
            {
                grade = 'B';
            }

            if (marks[i] >= 40 && marks[i] < 50)
            {
                grade = 'C';
            }

            if (marks[i] < 40)
            {
                grade = 'D';
            }
            System.out.println("Student " + i + " score is " + marks[i] + " and grade is " + grade);
        }



    }
}
