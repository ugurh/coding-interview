package java8.predicate;

public class Person {

    String name;
    int age;
    int yearOfService;

    public Person(String name, int age, int yearOfService) {
        this.name = name;
        this.age = age;
        this.yearOfService = yearOfService;
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

    public int getYearOfService() {
        return yearOfService;
    }

    public void setYearOfService(int yearOfService) {
        this.yearOfService = yearOfService;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", yearOfService=" + yearOfService +
                '}';
    }
}
