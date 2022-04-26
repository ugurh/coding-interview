package java_12;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class CompactNumberFormat {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 10, 100, 1000, 10000, 100000, 1000000, 1000000000);

        formatForLocale(Locale.US, numbers);
        formatForLocale(new Locale("tr"), numbers);
    }

    private static void formatForLocale(Locale locale, List<Integer> numbers) {

        System.out.printf("-- SHORT format for locale=%s --%n", locale);
        printFormat(locale, numbers, NumberFormat.Style.SHORT);

        System.out.printf("-- LONG format for locale=%s --%n", locale);
        printFormat(locale, numbers, NumberFormat.Style.LONG);

    }

    private static void printFormat(Locale locale, List<Integer> numbers, NumberFormat.Style style) {
        numbers.stream().forEach((num) -> {
            NumberFormat nf = NumberFormat.getCompactNumberInstance(locale, style);
            String format = nf.format(num);
            System.out.println(format);
        });
    }
}
