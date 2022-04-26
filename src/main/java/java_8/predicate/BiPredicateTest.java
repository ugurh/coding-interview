package java_8.predicate;

import java.util.function.BiPredicate;

public class BiPredicateTest {
    private static final int MIN_AGE = 18;

    public static void main(String[] args) {
        Person p = new Person("Harun", 57, 27);

        boolean eligible = isPersonEligibleForVoting(p, MIN_AGE, (person, minAge) -> p.age > minAge);
        System.out.println("Person is eligible for voting: " + eligible);
    }

    static boolean isPersonEligibleForVoting(Person person, Integer minAge, BiPredicate<Person, Integer> predicate) {
        return predicate.test(person, minAge);
    }
}
