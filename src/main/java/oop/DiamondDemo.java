package oop;

public class DiamondDemo implements InterfaceA, InterfaceB {
    @Override
    public void printSomething() {
        //Option 1 -> Provide our own implementation.
        System.out.println("I am inside Main class");

        //Option 2 -> Use existing implementation from interfaceA or interfaceB or both.
        InterfaceA.super.printSomething();
        InterfaceB.super.printSomething();
    }
}

interface InterfaceB {

    default void printSomething() {
        System.out.println("I am inside B interface");
    }

    static void main(String args[]){
        DiamondDemo main = new DiamondDemo();
        main.printSomething();
    }
}

interface InterfaceA {

    default void printSomething() {
        System.out.println("I am inside A interface");
    }
}