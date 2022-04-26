package java_12;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class CompactNumberFormatDefaultRounding {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1500, 1500000, 1200000000);

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
            nf.setRoundingMode(RoundingMode.HALF_DOWN);
            String format = nf.format(num);
            System.out.println(format);
        });
    }
}

