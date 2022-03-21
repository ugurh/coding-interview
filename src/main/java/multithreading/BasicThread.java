package multithreading;

public class BasicThread {

    static void printName(String name) throws InterruptedException {

        /********* Approach 1 ************/
        Thread t1 = new Thread(() -> System.out.println("Hello " + name));

        t1.start();
        t1.sleep(5000);
        t1.join();

        /********** Approach 2 ***********/
        Thread t2 = new Thread(new ExecuteMe());
        t2.start();
        t2.join();

        /********** Approach 3 ************/
        Subclass sub = new Subclass();
        sub.start();
        sub.join();

    }

    public static void main(String[] args) throws InterruptedException {
        printName("Harun");
    }

    static class ExecuteMe implements Runnable {
        @Override
        public void run() {
            System.out.println("I ran after extending Thread class");
        }
    }


    static class Subclass extends Thread {
        @Override
        public void run() {
            System.out.println("I ran after extending Thread class");
        }
    }

}