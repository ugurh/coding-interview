package multithreading;

import java.util.concurrent.Semaphore;

public class FixedMissedSignalExample {
    public static void example() throws InterruptedException {

        final Semaphore semaphore = new Semaphore(1);

        Thread signaller = new Thread(() -> {
            semaphore.release();
            System.out.println("Sent signal");
        });

        Thread waiter = new Thread(() -> {
            try {
                semaphore.acquire();
                System.out.println("Received signal");
            } catch (InterruptedException ie) {
                // handle interruption
            }
        });

        signaller.start();
        signaller.join();
        Thread.sleep(5000);
        waiter.start();
        waiter.join();

        System.out.println("Program Exiting.");
    }
}
