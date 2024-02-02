package OverRiding;

class Parent
{
    void display()
    {
        System.out.println("Hello!");
    }
}

class Child extends Parent
{
    void display() //over-riding
    {
        System.out.println("Hello World");
    }
}



public class Example {
    public static void main(String[] args) {

        Parent pr = new Parent();
        pr.display();

        Child ch = new Child();
        ch.display(); //the method of the child will be execute as it shadowed the parent method

        Parent sp = new Child(); //Dynamic Method Dispatch
        sp.display();  //the method of the object is execute not the reference

    }
}
