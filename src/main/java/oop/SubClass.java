package oop;

public class SubClass extends ParentClass {

    static void print() {
        System.out.println("SubClass...");
    }

    @Override
    SubClass get() {
        return new SubClass();
    }

    public static void main(String[] args) {
        ParentClass subClass = new SubClass();
        subClass.print();
    }

}
