package data_structures.arraylist;

import java.util.*;

class Employee {

    String name;
    int age;
    String country;

    public Employee(String name, int age, String country) {
        super();
        this.name = name;
        this.age = age;
        this.country = country;
    }


}

public class EmployeeListDemo {

    public static void main(String args[]) {
        /*
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Jane", 29,"USA"));
        list.add(new Employee("Alex", 54,"TR"));

        Collections.sort(list);
       // Collections.sort(list, (o1, o2) -> o1.name.compareTo(o2.name)); // use lambda expressions instead of anonymous classes.
        for (Employee emp : list) {
            System.out.println("Employee Name: " + emp.name + ", Employee Age: " + emp.age);
        }
        System.out.println("************************************************");
*/
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alex", 23, "USA"));
        employees.add(new Employee("Dave", 34, "India"));
        employees.add(new Employee("Carl", 21, "USA"));
        employees.add(new Employee("Joe", 56, "Russia"));
        employees.add(new Employee("Amit", 64, "China"));
        employees.add(new Employee("Ryan", 19, "Brazil"));

        /**
         * Problem 1: Find employees aged over 50#
         *
         * Problem 2: Find employees from the USA#
         *
         * Problem 3: Sort employees by country#
         */

        System.out.println("-------------------------------");
        employees.stream().filter(emp -> emp.age > 50).map(emp -> emp.name).forEach(System.out::println);

        Iterator<Employee> itr = employees.iterator();
        while (itr.hasNext()) {
            if (itr.next().country.equals("USA"))
                itr.remove();
        }
        for (Employee emp : employees) {
            System.out.println("Employee Name: " + emp.name + ", Employee Age: " + emp.age + ", Employee country: " + emp.country);
        }

        Collections.sort(employees, Comparator.comparing(e -> e.country));

        System.out.println("-------------------------------");
        for (Employee emp : employees) {
            System.out.println("Employee Name: " + emp.name + ", Employee Age: " + emp.age + ", Employee country: " + emp.country);
        }

        Set<Integer> set = new HashSet<>();

        set.add(23);
        set.add(34);
        set.add(56);


        set.forEach(System.out::println);
    }
}
