package java14;

import java.util.List;

public class PatternMatchingExample {

    public static void main(String[] args) {
        printLen(null);
        printLen("abc");
        System.out.println("--------");
        printLen(List.of("apple", "banana", "pie"));
    }

    private static void printLen(Object object) {
        if (object instanceof String str) {
            printStringLen(str);
        } else if (object instanceof List list) {
            for (Object o : list) {
                if (o instanceof String str) {
                    printStringLen(str);
                }
            }
        }
    }

    private static void printStringLen(String str) {
        System.out.printf("String: %s, Length: %s%n", str, str.length());
    }
}
