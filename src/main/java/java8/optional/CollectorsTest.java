package java8.optional;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsTest {
    public static void main(String args[]) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Alex", 23, 23000, "USA"));
        employeeList.add(new Employee("Ben", 63, 25000, "India"));
        employeeList.add(new Employee("Dave", 34, 56000, "Bhutan"));
        employeeList.add(new Employee("Jodi", 43, 67000, "China"));
        employeeList.add(new Employee("Ryan", 53, 54000, "Libya"));

        List<String> list = employeeList.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println(list);

        Set<String> set = employeeList.stream()
                .map(Employee::getCountry)
                .collect(Collectors.toSet());

        System.out.println(set);

        LinkedList<String> linkedList = employeeList.stream()
                .map(Employee::getName)
                .collect(Collectors.toCollection(LinkedList::new));

        System.out.println(linkedList);

        Map<String, Integer> map = list.stream()
                .collect(Collectors.toMap(s -> s, String::length));

        System.out.println(map);

        Map<String, Integer> nameMap = list.stream()
                .collect(Collectors.toMap(s -> s, String::length, (s1, s2) -> s1, HashMap::new));

        System.out.println(nameMap);

        List<String> unmodifiableList = list.stream()
                .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));

        System.out.println(unmodifiableList);

        long count = employeeList.stream()
                .filter(emp -> emp.getAge() > 30).count(); // Using the counting() method to get count of employees.

        System.out.println(count);
        int totalSalary = employeeList.stream().mapToInt(Employee::getSalary).sum();

        System.out.println(totalSalary);

        // Using averagingInt() method to get the average of salaries of all employees.
        double average = employeeList.stream()
                .collect(Collectors.averagingInt(Employee::getSalary));

        System.out.println(average);

        //Using minBy() method to get the employee with min salary.
        Optional<Employee> employee = employeeList.stream().min(Comparator.comparing(Employee::getSalary));
        employee.ifPresent(value -> System.out.println(value.getName()));

        //Using maxBy() method to get the employee with max salary.
        Optional<Employee> maxEmployee = employeeList.stream().max(Comparator.comparing(Employee::getSalary));
        maxEmployee.ifPresent(value -> System.out.println(value.getName()));

        IntSummaryStatistics summarizingInt = Stream.of("1", "2", "3")
                .collect(Collectors.summarizingInt(Integer::parseInt));
        System.out.println(summarizingInt);

        // Joining all the strings.
        String joinedString = Stream.of("hello", "how", "are", "you")
                .collect(Collectors.joining());
        System.out.println(joinedString);

        // Joining all the strings with space in between.
        joinedString = Stream.of("hello", "how", "are", "you")
                .collect(Collectors.joining(" "));
        System.out.println(joinedString);

        // Joining all the strings with space in between and a prefix and suffix.
        joinedString = Stream.of("hello", "how", "are", "you")
                .collect(Collectors.joining(" ", "prefix", "suffix"));
        System.out.println(joinedString);

        // The employees are grouped by country using the groupingBy() method.
        Map<String, List<Employee>> groupingBy = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getCountry));

        System.out.println(groupingBy);


        Map<String, Set<Employee>> employeeMap = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getCountry, Collectors.toSet()));

        System.out.println(employeeMap);
    }
}

class Employee {
    String name;
    int age;
    int salary;
    String country;

    Employee(String name, int age, int salary, String country) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

