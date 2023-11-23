package az.babayev.javarush.javasyntax.task.task03;

/*
Вывести на экран все возможные комбинации слов "Мама", "Мыла", "Раму".

Подсказка: их 6 штук.
Каждую комбинацию вывести с новой строки. Слова не разделять.

Пример:
МылаРамуМама
РамуМамаМыла
 */
public class Task6_01 {
    public static void main(String[] args) {
        System.out.println("МамаМылаРаму");
        System.out.println("МамаРамуМыла");
        System.out.println("МылаРамуМама");
        System.out.println("МылаМамаРаму");
        System.out.println("РамуМамаМыла");
        System.out.println("РамуМылаМама");
    }
}
