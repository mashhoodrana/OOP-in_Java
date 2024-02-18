package Static;

final class finalas {
    public final void show() {
        System.out.println("Hello!");
    }
}


class one extends finalas {  // can not extend from a final class

    public void show()   // can not override final method
    {
        System.out.println("hy");
    }
}

public class Practice2 {
    public static void main(String[] args) {
        
    }
}
