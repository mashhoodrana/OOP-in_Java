class StopWatch {
    private long startTime;
    private long endTime;

    StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
        endTime = 0;
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        if (endTime == 0) {
            return System.currentTimeMillis() - startTime; // Stop was not called, use current time
        } else {
            return endTime - startTime;
        }

    }
}

public class Q6 {
    public static void main(String[] args) {
        StopWatch st = new StopWatch();
        // Perform some operations
        for (int i = 0; i < 1000000; i++) {
            Math.sqrt(i);
        }
        
        // Stop the stopwatch
        st.stop();
        
        // Get and display elapsed time
        System.out.println("Elapsed Time: " + st.getElapsedTime() + " milliseconds");
    }
}
