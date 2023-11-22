package az.babayev.javarush.javasyntax.task.task02;

/*
Метод convertCelsiusToFahrenheit(int celsius) принимает значение в градусах Цельсия.
Метод должен переводить температуру и возвращать значение в градусах Фаренгейта.
Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
TF = (9 / 5) * TC + 32

Пример:
В метод convertCelsiusToFahrenheit на вход подается значение 41.

Пример вывода:
105.8
 */
public class Task2_05 {
    public static void main(String[] args) {
        double toFahrenheit = convertCelsiusToFahrenheit(41);
        System.out.println(toFahrenheit);
    }

    public static double convertCelsiusToFahrenheit(int celsius) {
        return (9.0 / 5) * celsius + 32;
    }
}
