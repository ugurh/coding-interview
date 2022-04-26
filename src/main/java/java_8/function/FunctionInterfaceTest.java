package java_8.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionInterfaceTest {

    public static void main(String[] args) {
        Function<String, Integer> function = String::length;

        System.out.println(function.apply("Merhaba Dünya"));
        // System.out.println(function.apply(null));

        // Function which adds 10 to the given element.
        Function<Integer, Integer> increment = x -> x + 10;
        // Function which doubles the given element.
        Function<Integer, Integer> multiply = y -> y * 2;
        Function<Integer, Integer> subtract = x -> x - 2;

        // Since we are using compose(), subtraction will be done first and then multiplication, increment and subtraction will be done.
        System.out.println("Compose result: " + increment.compose(multiply).compose(subtract).andThen(subtract).apply(3));

        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("Sum = " + add.apply(2, 3));

    }
}
