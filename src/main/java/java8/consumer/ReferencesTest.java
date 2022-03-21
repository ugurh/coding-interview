package java8.consumer;


import java.util.ArrayList;
import java.util.List;

public class ReferencesTest {


    public static int getLength(String str) {
        return str.length();
    }

    public int getLength2(String str) {
        return str.length();
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("done");
        list.add("word");
        list.add("practice");
        list.add("fake");

        // Code without using method reference.
        System.out.println("Code without using method reference");
        list.stream()
                .mapToInt(str -> ReferencesTest.getLength(str))
                .forEach(System.out::println);

        // Code with method reference.
        System.out.println("Code with method reference");
        list.stream()
                .mapToInt(ReferencesTest::getLength)
                .forEach(System.out::println);


        ReferencesTest obj = new ReferencesTest();
        // Code without instance method reference.
        list.stream()
                .mapToInt(str -> obj.getLength2(str))
                .forEach(System.out::println);

        // Code with instance method reference.
        list.stream()
                .mapToInt(obj::getLength2)
                .forEach(System.out::println);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Dave", 23, 20000));
        employees.add(new Employee("Joe", 18, 40000));
        employees.add(new Employee("Ryan", 54, 100000));
        employees.add(new Employee("Iyan", 5, 34000));
        employees.add(new Employee("Ray", 63, 54000));
        // Code without using method reference
        int totalSalary1 = employees.stream()
                .mapToInt(emp -> emp.getSalary())
                .sum();

        // Code with method reference
        int totalSalary = employees.stream()
                .mapToInt(Employee::getSalary)
                .sum();

        System.out.println("The total salary is " + totalSalary);


        // Code without constructor reference
        employees.stream()
                .map(name -> new Employee(name))
                .forEach(System.out::println);

        // Code with constructor reference
        employees.stream()
                .map(Employee::new)
                .forEach(System.out::println);

    }
}
