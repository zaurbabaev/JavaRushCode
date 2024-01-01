package az.babayev.javarush.javasyntax.task.task04;

import java.util.Scanner;

/*
Обычно скорость ветра указывается в м/с и не всегда понятно, насколько это много или мало.
Привычнее видеть величину скорости в км/ч, как у автомобиля, велосипеда или другого транспорта.
Поэтому сделаем конвертер величин скорости из м/с в км/ч.
Исходную величину скорости ветра в м/с нужно получить, считав ее как целое число из клавиатуры.
Соотношение скоростей такое: 1 м/с = 3.6 км/ч.
Необходимо вывести на экран скорость ветра в км/ч, округленную до ближайшего целого числа.
Для округления необходимо использовать метод Math.round().
 */
public class WindSpeed {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        if (console.hasNextDouble()) {
            double speed = console.nextDouble() * 3.6;
            long windSpeed = Math.round(speed);
            System.out.println(windSpeed);
        }
        console.close();
    }
}
