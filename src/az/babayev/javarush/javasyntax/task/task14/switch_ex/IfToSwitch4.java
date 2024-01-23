package az.babayev.javarush.javasyntax.task.task14.switch_ex;

/*
В классе IfToSwitch есть метод getMonthByIndex(int),
который возвращает название месяца по его номеру, начиная с 1.
Твоя задача — переписать метод, используя только оператор switch и
 ключевые слова case, break и default.
 */
public class IfToSwitch4 {

    public static void main(String[] args) {
        System.out.println(getMonthByIndex(4));
        System.out.println(getMonthByIndex(8));
        System.out.println(getMonthByIndex(12));
    }

    public static String getMonthByIndex(int monthIndex) {
        return switch (monthIndex) {
            case 1 -> "Январь";
            case 2 -> "Февраль";
            case 3 -> "Март";
            case 4 -> "Апрель";
            case 5 -> "Май";
            case 6 -> "Июнь";
            case 7 -> "Июль";
            case 8 -> "Август";
            case 9 -> "Сентябрь";
            case 10 -> "Октябрь";
            case 11 -> "Ноябрь";
            case 12 -> "Декабрь";
            default -> "Недействительный месяц";
        };
    }

}
