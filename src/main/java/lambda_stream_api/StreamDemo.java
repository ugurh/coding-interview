package lambda_stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        Stream<Integer> data = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        //filter operation to get only numbers greater than 4
        // Printing each number in the list after filtering.
        data.filter(num -> num > 4).forEach(System.out::println);

        //Created a list of Person object.
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Dave", 23));
        personList.add(new Person("Joe", 18));
        personList.add(new Person("Ryan", 54));
        personList.add(new Person("Iyan", 5));
        personList.add(new Person("Ray", 63));

        // We are filtering out those persons whose age is more than 18 and less than 60
        personList.stream()
                .filter(person -> person.getAge() > 18 && person.getAge() < 60)
                .forEach(System.out::println);

        List<String> list = new ArrayList<>();
        list.add("Dave");
        list.add("Joe");
        list.add("Ryan");
        list.add("Iyan");
        list.add("Ray");
        // map() is used to convert each name to upper case.
        // Note: The map() method does not modify the original list.
        list.stream()
                .map(name -> name.toUpperCase()) //map() takes an input of Function<T, R> type.
                .forEach(System.out::println);   // forEach() takes an input of Consumer type.

        list.stream()
                .mapToInt(name -> name.length())
                .forEach(System.out::println);

        List<List<String>> listX = new ArrayList<>();
        listX.add(Arrays.asList("a", "b", "c"));
        listX.add(Arrays.asList("d", "e", "f"));
        listX.add(Arrays.asList("g", "h", "i"));
        listX.add(Arrays.asList("j", "k", "l"));

        Stream<List<String>> stream1 = listX.stream();
        // filter() method do not work on stream of collections
        Stream<List<String>> stream2 = stream1.filter(x -> "a".equals(x.toString()));
        //This will not print anything
        stream2.forEach(System.out::println);

        //Created a stream from the list.
        Stream<List<String>> stream11 = listX.stream();
        // Flattened the stream.
        Stream<String> stream22 = stream11.flatMap(Collection::stream);
        //Applied filter on flattened stream.
        Stream<String> stream33 = stream22.filter("a"::equals);

        stream33.forEach(System.out::println);
    }

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
