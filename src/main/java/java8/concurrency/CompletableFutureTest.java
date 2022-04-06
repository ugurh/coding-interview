package java8.concurrency;

import java.util.concurrent.*;

public class CompletableFutureTest {


    public static void main(String args[]) {
        // Passing a runnable to runAsync() method.
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            System.out.println("1- Doing some processing : " + Thread.currentThread().getName());
        });

        System.out.println("2- This will print immediately : " + Thread.currentThread().getName());

        try {
            future.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("3- This will print after 5 seconds : " + Thread.currentThread().getName());
        System.out.println("-------------------------------");

        Executor executor = Executors.newFixedThreadPool(5);

        // Passing a runnable and executor as parameter to runAsync() method.
        future = CompletableFuture.runAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            System.out.println("1- Doing some processing : " + Thread.currentThread().getName());
        }, executor);

        System.out.println("2- This will print immediately : " + Thread.currentThread().getName());

        try {
            future.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("3- This will print after 5 seconds : " + Thread.currentThread().getName());

        System.out.println("-------------------------------");
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Hello World";
        });

        System.out.println("2- This will print immediately");

        try {
            System.out.println(future2.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("3- This will print after 5 seconds");


        System.out.println("-------------------------------");
        // Create a future which returns an integer.
        CompletableFuture<Integer> future3 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return 50;
        });

        // Calling thenApply() which takes a Function as parameter.
        // It takes a number as input and returns double of number.
        CompletableFuture<Integer> resultFuture = future3.thenApply(num -> {
            System.out.println(Thread.currentThread().getName());
            return num * 2;
        });

        try {
            System.out.println(resultFuture.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }


        // Create a future which returns an integer.
        CompletableFuture<Integer> future4 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return 50;
        });

        // Calling thenCompose() which takes a Function as parameter.
        // It takes a number as input and returns a CompletableFuture of double of number.
        CompletableFuture<Integer> resultFuture1 = future4.thenCompose(num ->
                CompletableFuture.supplyAsync(() -> num * 2));

        try {
            System.out.println(resultFuture1.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
