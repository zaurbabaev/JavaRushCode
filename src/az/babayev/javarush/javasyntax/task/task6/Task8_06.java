package az.babayev.javarush.javasyntax.task.task6;
   /*
    Программа должна считывать введенные пользователем вес в килограммах и рост в метрах и
    выводить на экран сообщение об индексе массы тела.
    Реализуй статический метод класса Body. Метод должен определить индекс массы тела, и
    вывести на экран сообщение:
    "Недовес: меньше чем 18.5" - если индекс массы тела меньше 18.5 (не включая),
    "Нормальный: между 18.5 и 25" - если индекс массы тела между 18.5 и 25 (не включая),
    "Избыточный вес: между 25 и 30" - если индекс массы тела между 25 и 30 (не включая),
    "Ожирение: 30 или больше" - если индекс массы тела 30 или больше.

    Подсказка:
    Индекс массы тела = вес в кг / (рост в метрах * рост в метрах)

    Пример вывода для 68.4 и 1.77:
    Нормальный: между 18.5 и 25
     */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(reader.readLine());
        double height = Double.parseDouble(reader.readLine());
        Body.calculateMassIndex(weight, height);

    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            double massIndex = weight / (height * height);
            String message =
                    (18.5 > massIndex) ? "Недовес: меньше чем 18.5" :
                            (massIndex > 18.5 && massIndex < 25) ? "Нормальный: между 18.5 и 25" :
                                    (massIndex > 25 && massIndex < 30) ? "Избыточный вес: между 25 и 30" :
                                            "Ожирение: 30 или больше";
            System.out.println(message);
        }
    }
}

