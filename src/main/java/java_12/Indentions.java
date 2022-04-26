package java_12;

public class Indentions {

    public static void main(String[] args) {
        String str = "a test string";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println("-- indented string --");
        String indentedStr = str.indent(5);
        System.out.println(indentedStr);
        System.out.println(indentedStr.length());


        // Multiline string
        String str2 = "a test\nstring";
        System.out.println(str2);
        System.out.println("-- indented string --");
        String indentedStr2 = str2.indent(5);
        System.out.println(indentedStr2);

        // If 'n' is negative then n number of strings are removed
        String str3 = "     a test\n     string";
        System.out.println(str3);
        String indentedStr3 = str3.indent(-2);
        System.out.println("-- negatively indented string --");
        System.out.println(indentedStr3);
    }
}
