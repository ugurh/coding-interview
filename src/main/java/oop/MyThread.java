package oop;

public class MyThread extends Thread {

    private volatile Thread threadStopper;

    public void start() {
        threadStopper = new Thread(this);
        threadStopper.start();
    }

    public void stopThread() {
        threadStopper = null;
    }

    public void run() {
        Thread currThread = Thread.currentThread();
        while (currThread == threadStopper) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) {
        // Get ID of Current Thread
        long id = Thread.currentThread().getId();
        // Get Name of Current Thread
        String name = Thread.currentThread().getName();
    }
}

