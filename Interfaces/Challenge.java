package Interfaces;



interface Member{
    void callback();
}

class Customer implements Member{
    String name;

    public Customer(String name)
    {
        this.name = name;
    }

    public void callback()
    {
        System.out.println("Ok, I will visit the store, " + name);
    }
}
class Store
{
    Member mem[] = new Member[100];
    int count = 0;

    void register(Member m)
    {
        mem[count++] = m;
    }

    void inviteSale()
    {
        for (int i=0; i<count; i++)
        {
            mem[i].callback();
        }
    }

}

public class Challenge {
    public static void main(String[] args) {
        Store s = new Store();
        Customer c1 = new Customer("Mashhood");
        Customer c2 = new Customer("Ali");
        s.register(c1);
        s.register(c2);
        s.inviteSale();
    }
}
