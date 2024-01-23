package az.babayev.javarush.javasyntax.task.task14.switch_ex;

/*
В классе IfToSwitch есть метод getMonthByIndex(int),
который возвращает название месяца по его номеру, начиная с 1.
Твоя задача — переписать метод, используя только оператор switch и
 ключевые слова case, break и default.
 */
public class IfToSwitch3 {

    public static void main(String[] args) {
        System.out.println(getMonthByIndex(4));
        System.out.println(getMonthByIndex(8));
        System.out.println(getMonthByIndex(12));
    }

    public static String getMonthByIndex(int monthIndex) {
        switch (monthIndex) {
            case 1:
                return "Январь";
            case 2:
                return "Февраль";
            case 3:
                return "Март";
            case 4:
                return "Апрель";
            case 5:
                return "Май";
            case 6:
                return "Июнь";
            case 7:
                return "Июль";
            case 8:
                return "Август";
            case 9:
                return "Сентябрь";
            case 10:
                return "Октябрь";
            case 11:
                return "Ноябрь";
            case 12:
                return "Декабрь";
            default:
                return "Недействительный месяц";
        }
    }

}
