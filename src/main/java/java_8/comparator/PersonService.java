package java_8.comparator;

import java.util.Comparator;
import java.util.List;

public class PersonService {

    private PersonService() {
    }

    public static void getPersons(List<Person> persons) {
        persons.sort(Comparator.comparing(Person::getName));
    }
}
