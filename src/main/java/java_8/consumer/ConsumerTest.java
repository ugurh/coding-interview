package java_8.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> consumer = (name) -> System.out.println("Hello " + name);
        consumer.accept("Harun");

        BiConsumer<String, Integer> biconsumer = (name, age) -> System.out.println("Hello " + name + ", Age :" + age);
        biconsumer.accept("Harun", 55);
    }
}
