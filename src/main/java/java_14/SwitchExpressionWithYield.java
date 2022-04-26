package java_14;

import java.time.LocalDate;
import java.time.Month;

public class SwitchExpressionWithYield {

    public static void main(String[] args) {
        showQuarter(LocalDate.now().getMonth());
    }

    public static void showQuarter(Month month) {

        String result = switch (month) {
            case JANUARY:
            case FEBRUARY:
            case MARCH:
                yield "First Quarter";
            case APRIL:
            case MAY:
            case JUNE:
                yield "Second Quarter";
            case JULY:
            case AUGUST:
            case SEPTEMBER:
                yield "Third Quarter";
            case OCTOBER:
            case NOVEMBER:
            case DECEMBER:
                yield "Forth Quarter";
            default:
                yield "Unknown Quarter";
        };
        System.out.println(result);
    }
}