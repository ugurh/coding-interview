package multithreading;

class ReorderingExample {

    Object lock1 = new Object();
    Object lock2 = new Object();

    private  int ping = 0;
    private  int pong = 0;
    private  int foo = 0;
    private  int bar = 0;

    /*
      Most folks would come up with the following possible outcomes:
      1 and 1
      1 and 0
      0 and 1
     */
    public void example() throws InterruptedException {
        Thread t1 = new Thread(() -> {
                foo = 1;
                ping = bar;
        });

        Thread t2 = new Thread(() -> {
                bar = 1;
                pong = foo;
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(ping + " " + pong);
    }
}
