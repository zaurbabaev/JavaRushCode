package az.babayev.javarush.javasyntax.task.task18.polymorphism.task1701;

/*
Класс Bat (летучая мышь) унаследован от класса Animal. Все логично,
вот только при вызове метода move() у объекта класса Bat выведется
в консоли "Я бегу!".
Зачем бежать, если ты умеешь летать?
Переопредели метод move() для класса Bat, чтобы он выводил в консоли "Я лечу!".
Метод main() в тестировании участия не принимает.
 */
public class Solution {
    public static void main(String[] args) {
        var bat = new Bat();
        bat.move();
    }

}
