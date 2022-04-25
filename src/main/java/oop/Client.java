package oop;

import java.io.Serializable;

public class Client implements Serializable {
    static Integer i;

    public static void main(String[] args) {
        // TODO document why this method is empty
        System.out.println("main...");
        main();
        System.out.println("length of args : " + args.length);
        GOztepe g1 = new GOztepe("Goztepe");
        System.out.println(i);
    }

    public static int main() {
        System.out.println("i : " + i);
        char x = 'X';
        System.out.println("x : " + x);
        byte b = 'x';
        System.out.println("b : " + b);
        return 0;
    }

    static class GOztepe {
        String name;

        GOztepe(String name) {
            this.name = name;
        }
    }
}
