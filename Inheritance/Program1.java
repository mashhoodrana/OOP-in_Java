class Accounts
{
    public String name;  //Data hiding
    public String accNo;
    public String DOB;
    public String email;
    public double balance;

    public Accounts(String name, String accNo, String DOB, String email, double balance) //Constructors
    {
        this.name=name;
        this.accNo=accNo;
        this.DOB=DOB;
        this.email=email;
        this.balance=balance;
    }

    public Accounts () {}

    public void setEmail(String mail)
    {
        mail=email;
    }

    public void setDob(String DOB)
    {
        this.DOB=DOB;
    }

    public String getName()
    {
        return name;
    }

    public String getAccNo()
    {
        return accNo;
    }

    public String getDob()
    {
        return DOB;
    }

    public String getEmail()
    {
        return email;
    }

    public double getBalance()
    {
        return balance;
    }

    public String close()
    {
        return "Account Closed!";
    }

    public String toString()
    {
        return "\nName: "+name + "\nAccount No: "+accNo + "\nDate of Birth: "+DOB + "\nEmail: "+email + "\nTotal Balance: "+balance; 
    }
}

class Saving extends Accounts
{
    public String deposit(double deposit)
    {
        return "Your Current balance is: " + (balance+deposit);
    }

    public String withdraw(double withDraw)
    {
        return "Remaining Amount: " + (balance-withDraw);
    }

    public double fixedDeposit()
    {
        return balance;
    }

    public String liquidate()
    {
        return "See you!";
    }
}

class loanAmount extends Accounts
{
    public String payEMI()
    {
        return "How much loan you want?: ";
    }

    public double Remaining(double loan)
    {
        return (balance-loan);
    }

    public double repayment()
    {
        return balance;
    }
} 

public class Program1{
    public static void main(String[] args) {
        Accounts acc = new Accounts("Mashhood Rana", "23CS0201053", " 31-12-2005", "xyz@gmail.com", 50000.325);
        System.out.println(acc);

        Saving s = new Saving();
        System.out.println(s.deposit(56786));
        System.out.println(s.withdraw(14000));
        
        loanAmount la = new loanAmount();
        System.out.println(la.Remaining(100000));

        System.out.println("Your balance is: " + la.repayment());

    }
}