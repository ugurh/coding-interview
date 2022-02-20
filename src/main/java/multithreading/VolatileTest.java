package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileTest {
    // volatile doesn't imply thread-safety!
    // static volatile int count = 0;

    private static final AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {

        int numThreads = 10;
        Thread[] threads = new Thread[numThreads];

        for (int t = 0; t < numThreads; t++) {
            threads[t] = new Thread(() -> {
                for (int c = 0; c < 1000; c++) {
                    //count++;
                    counter.incrementAndGet();
                }
            });
        }

        for (int s = 0; s < numThreads; s++) {
            threads[s].start();
        }

        for (int j = 0; j < numThreads; j++) {
            threads[j].join();
        }

       // System.out.println("count = " + count);
        System.out.println("count = " + counter.toString());
    }
}
