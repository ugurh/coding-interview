package oop;

@FunctionalInterface
public interface Functional {
    void doSomething();

    default void foo() {
        System.out.println("foo");
    }
}


/**
 * Interface vs abstract class#
 * Interfaces and abstract classes are both used to achieve abstraction but with some of the key differences:
 *
 * Interfaces	Abstract Classes
 * Support multiple inheritance	Don’t support multiple inheritance
 * All members are public	Can have private, protected and public members
 * All data members are static and final	Can have non-static and non-final members too
 * Can’t have constructors	Constructors can be defined
 */