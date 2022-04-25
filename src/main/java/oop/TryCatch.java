package oop;

public class TryCatch {

    public static void main(String[] args) {
        tryCatch();
    }

    static void tryCatch() {
        try {
            System.exit(0);
        } finally {
            System.out.println("Finally...");
        }
    }
}
