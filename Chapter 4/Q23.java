import java.util.Scanner;

public class Q23
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print ("Enter Employee's name: ");
        String name = sc.nextLine();
        System.out.print ("Enter numbers of hours worked in a week: ");
        int hours = sc.nextInt();
        System.out.print ("Enter hourly pay rate: ");
        float rate = sc.nextFloat();
        System.out.print ("Enter federal tax withholding rate: ");
        float tax = sc.nextFloat();
        System.out.print ("Enter state tax withholding rate: ");
        float tax2 = sc.nextFloat();
        float grossPay = hours * rate;

        float federalTax= grossPay*(tax*100)/100;
        float stateTax = grossPay*(tax2*100)/100;
        float totalDeduction = federalTax + stateTax;
        float netPay = grossPay - totalDeduction;

        System.out.println("Employee Name: " + name);
        System.out.println("Hours worked: " + hours);
        System.out.println("Pay Rate: " + "$" + rate);
        System.out.println("Gross Pay: " + "$" + grossPay);


        System.out.println("Deductions: ");
        System.out.println("Federal Withholding " + "(" + (tax*100) + ")" + ": " + "$" + federalTax);
        System.out.println("State Withholding " + "(" + (tax2*100) + ")"+ ": " + "$" + stateTax);
        System.out.println("Total Deduction: " + "$" +totalDeduction);
        System.out.println("Net Pay: " +"$" + netPay);




    }
}
