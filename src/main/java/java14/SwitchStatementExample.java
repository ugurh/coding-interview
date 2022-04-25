package java14;

import java.time.LocalDate;
import java.time.Month;

import static java.lang.System.out;

public class SwitchStatementExample {

    public static void main(String[] args) {
        showQuarter(LocalDate.now().getMonth());
    }

    public static void showQuarter(Month month) {
        switch (month) {
            case JANUARY, FEBRUARY, MARCH -> out.println("First Quarter");//no break needed
            case APRIL, MAY, JUNE -> out.println("Second Quarter");
            case JULY, AUGUST, SEPTEMBER -> out.println("Third Quarter");
            case OCTOBER, NOVEMBER, DECEMBER -> out.println("Forth Quarter");
            default -> out.println("Unknown Quarter");
        }
    }
}
