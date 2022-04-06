package java8.concurrency;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {

    public static void main(String[] args) {
        CompletableFuture<String> completableFuture = CompletableFuture.completedFuture(getHelloWorld());
        try {
            System.out.println(completableFuture.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String getHelloWorld() {
        return "Hello World";
    }
}
