package oop;


public interface IInterface extends Cloneable {
    int x = 0;

    static void print() {
        System.out.println("IInterface...");
    }

    default void x() {

    }

    public void c();
}
