package java8.supplier;

import java.util.Random;
import java.util.function.DoubleSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SupplierTest {

    static Logger logger = Logger.getLogger(String.valueOf(SupplierTest.class));

    public static void main(String[] args) {
        Supplier<Person> supplier = () -> new Person("Harun UGUR", 42, 15);
        Predicate<Person> predicate = person -> person.age > 18;

        boolean isEligible = isPersonEligibleForVoting(supplier, predicate);
        logger.log(Level.INFO, "Person is eligible for voting: {0} ", isEligible);
        DoubleSupplier doubleSupplier = () -> (new Random().nextInt() * 10);

        logger.log(Level.INFO, "doubleSupplier: {0} ", doubleSupplier.getAsDouble());
    }

    static <T> boolean isPersonEligibleForVoting(Supplier<T> supplier, Predicate<T> predicate) {
        return predicate.test(supplier.get());
    }
}
