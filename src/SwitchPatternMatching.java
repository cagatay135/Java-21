package src;

import java.math.BigDecimal;
import java.time.DayOfWeek;


class SwitchPatternMatching {

    public static void main(String[] args) {
        String value = asStringValue(64L);
        System.out.println(value);

        boolean isWeekend = isTheWeekend(DayOfWeek.SATURDAY);
        System.out.println(isWeekend);
        }

    static String asStringValue(Object anyValue) {
        return switch (anyValue) {
            case String str      -> str;
            case BigDecimal bd   -> bd.toEngineeringString();
            case Integer i       -> Integer.toString(i);
            case Long l          -> Long.toString(l);
            case null            -> "null";
            default              -> "n/a";
        };
    }

    static boolean isTheWeekend(DayOfWeek dayOfWeek) {
        return switch (dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY  -> false;
            case SATURDAY, SUNDAY                              -> true;
            case null,default                                  -> throw new IllegalArgumentException("Invalid day: " + dayOfWeek);
        };
    }
}