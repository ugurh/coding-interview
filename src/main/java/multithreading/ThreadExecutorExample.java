package multithreading;

import java.util.concurrent.Executor;

public class ThreadExecutorExample {

    public static void main(String[] args) {
        ExecutorService executor = new ExecutorService();
        executor.execute(new Task());
    }

    static class ExecutorService implements Executor {
        @Override
        public void execute(Runnable command) {
            Thread thread = new Thread(command);
            thread.start();
        }
    }

    static class Task implements Runnable {
        @Override
        public void run() {
            System.out.println("Task is running now ...");
        }
    }
}
