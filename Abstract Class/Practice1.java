abstract class Number {
    public Number() // Constructors
    {
        System.out.println("Digit is a number!");
    }

    public void func1() {
        System.out.println("Parent Meth-1");
    }

    abstract public void func2(); // abstract method

}

class WholeNumber extends Number {
    public void func2() {
        System.out.println("Child Meth-2!");
    }
}

class Practice1 {
    public static void main(String[] args) {
        Number num = new WholeNumber(); // only the reference of an abstract class can be declared not the object
        num.func1();
        num.func2();

    }
}