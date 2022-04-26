package java_14;

import java.time.LocalDate;
import java.time.Month;

public class SwitchExpressionExample {

    public static void main(String[] args) {
        showQuarter(LocalDate.now().getMonth());
    }

    public static void showQuarter(Month month) {

        String quarter = switch (month) {
            case JANUARY, FEBRUARY, MARCH -> "First Quarter"; //must be a single returning value
            case APRIL, MAY, JUNE -> "Second Quarter";
            case JULY, AUGUST, SEPTEMBER -> "Third Quarter";
            case OCTOBER, NOVEMBER, DECEMBER -> "Forth Quarter";
            default -> "Unknown Quarter";
        };

        System.out.println(quarter);
    }
}
