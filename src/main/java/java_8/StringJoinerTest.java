package java_8;

import java.util.StringJoiner;

public class StringJoinerTest {

    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(":", "[", "]");
        sj.add("One").add("Two").add("Three");
        String desiredString = sj.toString();
        System.out.println("Desired String -> " + desiredString);
    }
}
