import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;


class Solution {
    public int daysBetweenDates(String date1, String date2) {
        LocalDate localDate1 = LocalDate.parse(date1);
        LocalDate localDate2 = LocalDate.parse(date2);
        return (int) Math.abs(ChronoUnit.DAYS.between(localDate2, localDate1));
    }
}