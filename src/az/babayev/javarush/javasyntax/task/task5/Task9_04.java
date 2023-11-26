package az.babayev.javarush.javasyntax.task.task5;

/*
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
 */
public class Task9_04 {
    public static class Circle {
        int centerX;
        int centerY;
        int radius;
        int width;
        int color;
        public Circle(int centerX, int centerY, int radius) {
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
        }
        public Circle(int centerX, int centerY, int radius, int width) {
            this(centerX, centerY, radius);
            this.width = width;
        }
        public Circle(int centerX, int centerY, int radius, int width, int color) {
            this(centerX, centerY, radius, width);
            this.color = color;
        }
    }
}
