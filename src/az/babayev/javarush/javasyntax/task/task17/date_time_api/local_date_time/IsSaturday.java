package az.babayev.javarush.javasyntax.task.task17.date_time_api.local_date_time;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/*
Реализуй метод isWeekend. Он должен определять, относится ли параметр dateTime к
выходным.Считаем выходными промежуток между 22:00 пятницы (включительно)
и 23:00 воскресенья (не включительно).
 */
public class IsSaturday {
    private static final int FRIDAY = 5;
    private static final int SATURDAY = 6;
    private static final int SUNDAY = 7;
    private static final int WEEKEND_START_FRIDAY_CUT_OFF_HOUR = 22;
    private static final int WEEKEND_END_SUNDAY_CUT_OFF_HOUR = 23;

    public static void main(String[] args) {
        List<LocalDateTime> dateTimeLIst = new ArrayList<>(List.of(
                LocalDateTime.of(2016, 4, 22, 18, 39),
                LocalDateTime.of(2016, 4, 22, 21, 59),
                LocalDateTime.of(2016, 4, 22, 22, 0),
                LocalDateTime.of(2016, 4, 23, 5, 0),
                LocalDateTime.of(2016, 4, 24, 8, 0),
                LocalDateTime.of(2016, 4, 24, 22, 59),
                LocalDateTime.of(2016, 4, 24, 23, 0),
                LocalDateTime.of(2016, 4, 25, 11, 5)
        ));
        for (LocalDateTime dateTime : dateTimeLIst) {
            System.out.println(dateTime + ", is weekend - " + isWeekend(dateTime));
        }
    }

    public static boolean isWeekend(LocalDateTime dateTime) {
        return dateTime.getDayOfWeek().getValue() == FRIDAY && dateTime.getHour() >= WEEKEND_START_FRIDAY_CUT_OFF_HOUR
                || dateTime.getDayOfWeek().getValue() == SATURDAY
                || dateTime.getDayOfWeek().getValue() == SUNDAY && dateTime.getHour() < WEEKEND_END_SUNDAY_CUT_OFF_HOUR;

    }

}
