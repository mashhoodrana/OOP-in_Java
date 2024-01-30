import java.util.Scanner;
public class Q1
{
    public static int getPentagonalNumber(int n){
        int series = n*((3*n) - 1)/2;
        return series;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(getPentagonalNumber(num));


    }
}
