import java.util.Date;

public class Q3 {
    public static void main(String[] args) {
        long[] elapsedTimeArray = {10000L, 100000L, 1000000L, 10000000L, 100000000L, 1000000000L, 10000000000L, 100000000000L};
        
        for (int i = 0; i < elapsedTimeArray.length; i++) {
            long elapsedTime = elapsedTimeArray[i];
            Date date = new Date(elapsedTime);
            System.out.println("Elapsed Time: " + elapsedTime + " milliseconds");
            System.out.println("Date and Time: " + date.toString() + "\n");
        }
    }
}


