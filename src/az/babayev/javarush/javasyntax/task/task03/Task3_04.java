package az.babayev.javarush.javasyntax.task.task03;

/*
Напиши код метода convertEurToUsd, который переводит евро
в доллары по заданному курсу.Для возврата результата из метода convertEurToUsd
 используй оператор return. Пример: return 123*435;
Вызови метод convertEurToUsd дважды в методе main с любыми параметрами.
Результаты выведи на экран, каждый раз с новой строки.

Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс
 */
public class Task3_04 {
    public static void main(String[] args) {
        double euroToUsd1 = convertEuroToUsd(100, 1.72);
        double euroToUsd2 = convertEuroToUsd(300, 1.72);
        System.out.println(euroToUsd1);
        System.out.println(euroToUsd2);

    }

    public static double convertEuroToUsd(int eur, double exchangeRate) {
        return eur * exchangeRate;
    }
}

