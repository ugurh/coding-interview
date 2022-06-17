package java_8;

import static java.lang.System.out;
import java.util.function.*;

public class Func {

    static Function<String, String> atr = (name) -> "@" + name;
    static Function<String, Integer> leng = String::length;
    static Function<String, Integer> leng2 = String::length;

    public String name() {
        return "foo";
    }

    public static void main(String[] args) {
        String[] strs = {"foo", "bar", "bash"};

        for (String s : strs) out.println(atr.apply(s)); //appending @ to the string
        for (String s : strs) out.println(leng2.apply(s)); //length of the strings

        Function<Func, String> name = Func::name;

        out.println(name.apply(new Func()));
    }

}
