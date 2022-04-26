package java_12;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class CompactNumberFormatParse {

    public static void main(String[] args) throws ParseException {

        NumberFormat nf = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        System.out.println("-- short compact parsing --");
        Number num = nf.parse("1K");
        System.out.println(num);
        num = nf.parse("1M");
        System.out.println(num);
        num = nf.parse("1B");
        System.out.println(num);

        System.out.println("-- long compact parsing --");
        nf = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
        num = nf.parse("1 thousand");
        System.out.println(num);
        num = nf.parse("1 million");
        System.out.println(num);
        num = nf.parse("1 billion");
        System.out.println(num);
    }

}

