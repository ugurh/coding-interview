package java_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Compare {

    public List<String> printStrings(List<String> list) {
        list.forEach(System.out::println);
        return list;
    }

    public List<String> sortStrings_7(List<String> list) {
        // Java 7
        System.out.println("-----------Java 7-----------------");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });
        printStrings(list);
        System.out.println("---------------");

        return list;
    }

    public List<String> sortStrings_8(List<String> list) {
        System.out.println("Java 8");
        //Java 8
        Collections.sort(list, (s1, s2) -> s1.length() - s2.length());
        // or
        list.sort(Comparator.comparingInt(String::length));
        printStrings(list);

        return list;
    }

    public List<Person> sortPeople_7(List<Person> list) {
        // Java 7
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                int n = p1.getLastName().compareTo(p2.getLastName());
                if (n == 0) {
                    return p1.getFirstName().compareTo(p2.getFirstName());
                }
                return n;
            }
        });
        return list;
    }

    public List<Person> sortPeople_8(List<Person> list) {
        //Java 8
        list.sort(Comparator.comparing(Person::getLastName)
                            .thenComparing(Person::getFirstName));

        return list;
    }

    public static void main(String[] args) {
        Compare c = new Compare();
        List<String> list = Arrays.asList("foo", "bar", "bash", "bo");
        c.sortStrings_7(list);

        Person[] peopleArr = {
                new Person("Tom", "Ford"),
                new Person("Bill", "Clinton"),
                new Person("Carly", "Desuza")
        };
        List<Person> personList = Arrays.asList(peopleArr);
        c.sortPeople_7(personList);

        for (int i = 0; i < 3; i++) {
            System.out.println((personList.get(i)).getFirstName() + " " + (personList.get(i)).getLastName());
        }
    }


    public static class Person {
        String firstName;
        String lastName;

        //constructor
        Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        //getters
        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }
}
