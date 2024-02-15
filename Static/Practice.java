package Static;


class hondaCity {
    static long x = 10;
    int a, b;

    static double onRoadPrice(String name) {
        switch (name) {
            case "Karachi":
               return x*10.2;

            case "Multan":
                return x*2.23;

            default:
                System.out.println("Error!");
        }
    }
}

public class Practice {
    public static void main(String[] args) {
        hondaCity h1 = new hondaCity();
        
        System.out.println(h1.x);
        h1.x=100;
        System.out.println(h1.x);
        System.out.println(h1.onRoadPrice("Multan"););
    }
}