package az.babayev.javarush.javasyntax.task.task03;

/*
Амиго, сегодня наша задача наполнить корабельный бассейн.
Нужно посчитать, сколько литров воды нужно для заполнения бассейна до бортов.
Известно, что бассейн имеет линейные размеры a × b × c, заданные в метрах.
Эти размеры передаются в метод getVolume. Метод должен вернуть количество
литров воды, которое нужно для наполнения бассейна.

V=a*b*c cavab kub.m
1kub.m=1000litr
Пример:
Метод getVolume вызывается с параметрами 25, 5, 2.

Пример вывода:
250000
 */
public class Task5_03 {
    public static void main(String[] args) {
        System.out.println(getVolume(25, 5, 2));
    }

    public static long getVolume(int a, int b, int c) {
        int v = a * b * c;
        return v * 1000;

    }
}
