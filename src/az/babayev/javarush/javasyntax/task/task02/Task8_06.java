package az.babayev.javarush.javasyntax.task.task02;

/*
- Амиго, ты знал, что сила тяжести на Луне составляет примерно 17% от силы тяжести на Земле?
- Нет.
- Вот и я не знал. А теперь этой информацией нужно пользоваться часто, и, чтобы не считать каждый раз,
реализуй метод getWeight(int), который принимает вес тела (в Ньютонах) на Земле, и возвращает,
сколько это тело будет весить на Луне (в Ньютонах).
Тип возвращаемого значения - double.

Пример:
Метод getWeight вызывается с параметром 888.

Пример вывода:
150.96
 */
public class Task8_06 {
    public static void main(String[] args) {
        double weight = getWeight(888);
        System.out.println(weight);
    }


    public static double getWeight(int earthWeight) {
        return earthWeight * 17.0 / 100;
    }
}
