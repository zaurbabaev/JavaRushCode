package az.babayev.javarush.javasyntax.task.task14.switch_ex;

/*
В классе SwitchToIfElse есть метод getTranslationForDayOfWeek(String),
который возвращает перевод дня недели с русского на английский.
Твоя задача — переписать метод, используя только оператор if-else.
 */
public class SwitchToIfElse {
    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("Вторник"));
        System.out.println(getTranslationForDayOfWeek("Пятница"));
        System.out.println(getTranslationForDayOfWeek("Высплюсенье"));
    }

    // switchin if formasi
    public static String getTranslationForDayOfWeek(String ru) {
        if (ru.equalsIgnoreCase("понедельник")) {
            return "Monday";
        } else if (ru.equalsIgnoreCase("вторник")) {
            return "Tuesday";
        } else if (ru.equalsIgnoreCase("среда")) {
            return "Wednesday";
        } else if (ru.equalsIgnoreCase("четверг")) {
            return "Thursday";
        } else if (ru.equalsIgnoreCase("пятница")) {
            return "Friday";
        } else if (ru.equalsIgnoreCase("суббота")) {
            return "Saturday";
        } else if (ru.equalsIgnoreCase("воскресенье")) {
            return "Sunday";
        } else {
            return "Недействительный день недели";
        }
    }


    public static String getTranslationForDayOfWeek2(String ru) {
        return switch (ru.toLowerCase()) {
            case "понедельник" -> "Monday";
            case "вторник" -> "Tuesday";
            case "среда" -> "Wednesday";
            case "четверг" -> "Thursday";
            case "пятница" -> "Friday";
            case "суббота" -> "Saturday";
            case "воскресенье" -> "Sunday";
            default -> "Недействительный день недели";
        };

    }
}