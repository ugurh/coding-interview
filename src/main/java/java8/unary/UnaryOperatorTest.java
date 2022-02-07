package java8.unary;

import java8.predicate.Person;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorTest {

    public static void main(String[] args) {

        UnaryOperator<Person> unary = p -> {
            p.setName("Update " + p.getName());
            return p;
        };

        Person p = unary.apply(new Person("Harun", 45, 12));

        System.out.println(p);

        IntUnaryOperator operator = num -> num * num;

        System.out.println(operator.applyAsInt(25));
    }
}
