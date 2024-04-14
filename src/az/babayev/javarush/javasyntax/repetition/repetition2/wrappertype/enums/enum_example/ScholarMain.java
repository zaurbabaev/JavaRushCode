package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype.enums.enum_example;

public class ScholarMain {
    public static void main(String[] args) {
        ScholarSchedule scholarSchedule = new ScholarSchedule();
        scholarSchedule.setDayOfWeek(DayOfWeek.FRIDAY);

        Scholar scholar = new Scholar(scholarSchedule);
        scholar.wakeUp();
    }
}
