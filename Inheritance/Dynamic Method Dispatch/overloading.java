// package Dynamic Method Dispatch;

class Parent {
    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public int max(int x, int y, int z) {
        if (x > y && x > z)
            return x;
        else if (x < y)
            return y;
        return z;
    }
}

public class overloading {
    public static void main(String[] args) {
        Parent pr = new Parent(); //Compile Time Polymorpshism
        pr.max(10, 100);  
        pr.max(1, 2, 3);
    }
}