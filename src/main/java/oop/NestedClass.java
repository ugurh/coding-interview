package oop;

public class NestedClass {

    public static void main(String[] args) {
        Nested.p();
    }

    interface Nested {

        static void p() {
            System.out.println("Nested Interface...");
        }
    }
}
