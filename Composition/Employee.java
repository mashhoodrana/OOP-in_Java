import Interfaces.Customer;

class Employee1 {
    private int id;
    private String name;

    Address postalAddress;

    public Employee1(int id, String name) {
        setId(id);
        setName(name);
    }

    public Employee1(int id, String name, Address postalAddress) {
        this(id, name);
        this.postalAddress=postalAddress;
    }

    public Address getpostalAddress()
    {
        return postalAddress;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class Customer {
    Address postalAddress;
    int regNO;

    public Customer(int regNO, Address postalAddress)
    {
        this.regNO = regNO;
        this.postalAddress=postalAddress;
    }

    public Address getPostalAddress()
    {
        return postalAddress;
    }


}

class Address {
    String streetAddress;
    String Town;
    String City;

    public Address(String streetAddress, String Town, String City)
    {
        this.streetAddress=streetAddress;
        this.Town=Town;
        this.City=City;
    }


}

public class Employee {
    public static void main(String[] args) {
        Address postalAddress = new Address("House No 4, Block-A", "Model Town", "Multan");

        Employee1 emp = new Employee1(1, "Mashhod", postalAddress);
        System.out.println(emp.getId());
        System.out.println(emp.getName());
        System.out.println(emp.getpostalAddress().streetAddress);
        System.out.println(emp.getpostalAddress().Town);
        System.out.println(emp.getpostalAddress().City);

        Customer cum = new Customer(230, postalAddress);
        System.out.println(cum.getPostalAddress().Town);

    }

}