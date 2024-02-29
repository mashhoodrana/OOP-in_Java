import java.util.Random;

public class Q4 {
    public static void main(String[] args) {
        Random random = new Random(1000); //for same sequence number we used seed value
        for (int i = 0; i < 50; i++) {
            int randomNumber = random.nextInt(101); //generate no. b/w 0-100
            System.out.println("Random Number " + (i + 1) + ": " + randomNumber);
        }
    }
}
