package problems;

public class Person implements Comparable<Person> {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        if (o == null || o.getName() == null)
            return 1;
        return this.name.compareTo(o.getName());
    }
}
