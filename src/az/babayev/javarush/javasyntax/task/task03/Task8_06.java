package az.babayev.javarush.javasyntax.task.task03;

/*
Реализуй метод getMetreFromCentimetre(int centimetre).
Метод на вход принимает количество сантиметров.
Нужно сделать так,чтобы метод возвращал число полных метров в centimetre.
(1 метр = 100 см).

Пример:
Метод getMetreFromCentimetre вызывается с параметром 243.

Пример вывода:
2
 */
public class Task8_06 {
    public static void main(String[] args) {
        int metreFromCentimetre = getMetreFromCentimetre(243);
        System.out.println(metreFromCentimetre);
    }

    public static int getMetreFromCentimetre(int centimetre) {
        return centimetre * 1 / 100;
    }
}

