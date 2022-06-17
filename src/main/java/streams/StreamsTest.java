package streams;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsTest {

    public static void main(String[] args) {
        // Creating a String array
        String[] arr = {"Hello", "World", "This", "Is",
                "An", "Example", "of", "Streams"};

        Stream<String> stream = StreamsTest.of(arr);
        stream.forEach(System.out::println);
    }

    public static <T> Stream<T> of(T... values) {
        return Arrays.stream(values);
    }
}
