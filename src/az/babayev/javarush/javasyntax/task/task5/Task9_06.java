package az.babayev.javarush.javasyntax.task.task5;

/*
Разберись, что делает программа.
Исправь конструктор с двумя параметрами так, чтобы он вызывал другой конструктор
с радиусом 10.
Подумай, какой конструктор нужно вызвать.
Подсказка:
внимательно изучи реализацию конструктора по умолчанию.
 */
public class Task9_06 {
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

        public static void main(String[] args) {
            Circle circle = new Circle();
            System.out.println(circle.x + " " + circle.y + " " + circle.radius);
            Circle anotherCircle = new Circle(10, 5);
            System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
        }
    }
}
