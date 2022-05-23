package hackerrank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
explain the regular expression:

    <(.+)>
        matches HTML start tags. The parentheses save the contents inside the brackets into Group #1.

    ([^<]+)
        matches all the text in between the HTML start and end tags.
        We place a special restriction on the text in that it can't have the "<" symbol.
        The characters inside the parenthesis are saved into Group #2.

    </\\1>
 */
public class TagContentExtractor {

    public static void main(String[] args) {
        String line = "<p>harun</p>";

        String regex = "<([^<>]+)>([^<>]+)</\\1>";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(line);
        int counter = 0;
        while (matcher.find()) {
            System.out.println(matcher.group(2));
            counter++;
        }

        if (counter == 0)
            System.out.println("None");
    }

}
