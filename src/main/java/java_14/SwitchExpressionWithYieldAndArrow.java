package java_14;

import java.time.LocalDate;
import java.time.Month;

public class SwitchExpressionWithYieldAndArrow {

    public static void main(String[] args) {
        showQuarter(LocalDate.now().getMonth());
    }

    public static void showQuarter(Month month) {

        String result = switch (month) {
            case JANUARY,
                    FEBRUARY,
                    MARCH -> {
                yield "First Quarter";
            }
            case APRIL, MAY, JUNE -> {
                yield "Second Quarter";
            }
            case JULY, AUGUST, SEPTEMBER -> "Third Quarter";
            case OCTOBER, NOVEMBER, DECEMBER -> {
                yield "Forth Quarter";
            }
            default -> "Unknown Quarter";
        };

        System.out.println(result);
    }
}
