package oop;

public class ParentClass {
    final Integer P;
    static final String S;

    static {
        S = "S";
    }

    ParentClass() {
        this.P = 0;
    }

    static void print() {
        System.out.println("ParentClass...");
    }

    ParentClass get() {
        return new ParentClass();
    }
}
