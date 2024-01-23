package az.babayev.javarush.javasyntax.task.task14.switch_ex;

/*
В классе IfToSwitch есть метод getMonthByIndex(int),
который возвращает название месяца по его номеру, начиная с 1.
Твоя задача — переписать метод, используя только оператор switch и
 ключевые слова case, break и default.
 */
public class IfToSwitch5 {

    public static void main(String[] args) {
        System.out.println(getMonthByIndex(4));
        System.out.println(getMonthByIndex(8));
        System.out.println(getMonthByIndex(12));
    }

    public static String getMonthByIndex(int monthIndex) {
        return switch (monthIndex) {
            case 1:
                yield "Январь";
            case 2:
                yield "Февраль";
            case 3:
                yield "Март";
            case 4:
                yield "Апрель";
            case 5:
                yield "Май";
            case 6:
                yield "Июнь";
            case 7:
                yield "Июль";
            case 8:
                yield "Август";
            case 9:
                yield "Сентябрь";
            case 10:
                yield "Октябрь";
            case 11:
                yield "Ноябрь";
            case 12:
                yield "Декабрь";
            default:
                yield "Недействительный месяц";
        };
    }

}
