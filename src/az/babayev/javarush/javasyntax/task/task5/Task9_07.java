package az.babayev.javarush.javasyntax.task.task5;

/*
Изучи класс Circle. Напиши максимальное количество конструкторов с
разными аргументами.

Подсказка:
не забудь про конструктор по умолчанию.
 */
public class Task9_07 {
    public static class Circle {
        public double x;
        public double y;
        public double radius;

        public Circle(double x, double y, double radius) {
            this.x = x;
            this.y = y;
            this.radius = radius;
        }

        public Circle(double x, double y) {
            this(x, y, 10);
        }

        public Circle() {
            this(5, 5, 1);
        }

        public Circle(double radius) {
            this(5, 5, radius);
        }

        public static void main(String[] args) {
        }
    }
}
