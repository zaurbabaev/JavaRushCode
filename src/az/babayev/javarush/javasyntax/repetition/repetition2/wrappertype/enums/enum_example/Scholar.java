package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype.enums.enum_example;


public class Scholar {
    private final ScholarSchedule scholarSchedule;

    public Scholar(ScholarSchedule scholarSchedule) {
        this.scholarSchedule = scholarSchedule;
    }

    public void wakeUp() {
        if (scholarSchedule.getDayOfWeek() == DayOfWeek.SUNDAY) {
            System.out.println("Ура, можно поспать еще!");
        } else {
            System.out.println("Блин, опять в школу:(");
        }
    }
}
