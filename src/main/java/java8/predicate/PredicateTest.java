package java8.predicate;

import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {
        Person p = new Person("Harun", 57, 27);
        Predicate<Person> graterThan18 = person -> person.age > 18;
        Predicate<Person> lowerThan60 = person -> person.age < 60;
        Predicate<Person> greaterThan60 = person -> person.age > 60;
        Predicate<Person> yearOfService = person -> person.yearOfService > 25;

        boolean eligible = isPersonEligibleForVoting(p, graterThan18);
        System.out.println("Person is eligible for voting: " + eligible);

        eligible = isPersonEligibleForMembership(p, graterThan18.and(lowerThan60));
        System.out.println("Person is eligible for membership: " + eligible);

        eligible = isPersonEligibleForRetirements(p, greaterThan60.or(yearOfService));
        System.out.println("Person is eligible for retirement: " + eligible);

        Predicate<Integer> numberGreaterThanTen = n -> n > 10;
        boolean isLessThanTen = isNumberLessThanTen(numberGreaterThanTen);
        System.out.println("Is number less than ten: " + isLessThanTen);

        String s1 = "Merhaba";
        String s3 = new String("Merhaba");
        Predicate<String> predicate  = Predicate.isEqual(s1);
        // The same thing can be achieved by below lambda.
        // Predicate<String> predicate  = p -> p.equals("Hello");
        System.out.println(predicate.test(s3));
    }

    private static boolean isPersonEligibleForMembership(Person p, Predicate<Person> predicate) {
        return predicate.test(p);
    }

    private static boolean isPersonEligibleForVoting(Person p, Predicate<Person> predicate) {
        return predicate.test(p);
    }

    private static boolean isPersonEligibleForRetirements(Person p, Predicate<Person> predicate) {
        return predicate.test(p);
    }

    static boolean isNumberLessThanTen(Predicate<Integer> predicate) {
        return predicate.negate().test(14);
    }

}
