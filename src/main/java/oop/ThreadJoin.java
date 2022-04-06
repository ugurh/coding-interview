package oop;

public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread importantThread = new Thread(() -> {
            //do something
        }
        );
        Thread currentThread = new Thread(() -> {
            //do something
        }
        );
        importantThread.start(); // Line 1
        importantThread.join(); // Line 2
        currentThread.start(); // Line 3
    }
}
