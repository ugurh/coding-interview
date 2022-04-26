package java_8.optional;

import java.util.*;

public class OptionalTest {


    Map<Integer, Employee> empMap = new HashMap<>();

    public Optional<Employee> getEmployee(Integer employeeId) {
        return Optional.ofNullable(empMap.get(employeeId));
    }

    public static String getDefaultValue() {
        return "default";
    }

    public static void main(String[] args) {
        OptionalTest demo = new OptionalTest();
        Optional<Employee> emp = demo.getEmployee(123);
        if (emp.isPresent()) {
            System.out.println(emp.get().getName());
        } else {
            System.out.println("No employee returned.");
        }

        Optional<String> optional = Optional.ofNullable(null);
        // This will throw exception because optional contains a null value.
        //System.out.println(optional.get());

        // This will return the default value.
        System.out.println(optional.orElseGet(OptionalTest::getDefaultValue));

        // This will throw exception
        try {
            //System.out.println(optional.orElseThrow(() -> new Exception("Resource not found.")));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Since the filter condition is matched, this will return the optional.
        System.out.println(optional.filter(str -> str.equals("orange")));

        // Since the filter condition is not matched, this will return empty optional.
        System.out.println(optional.filter(str -> str.equals("apple")));


    }

    class Employee {
        Long id;
        String name;
        int age;
        int salary;

        public Employee(Long id, String name, int age, int salary) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }
    }
}
