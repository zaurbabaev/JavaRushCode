package az.babayev.javarush.javasyntax.task.task5;

/*
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
 */
public class Task7_04 {
    public static class Circle {
        public int centerX;
        public int centerY;
        public int radius;
        public int widht;
        public int color;

        public void initialize(int centerX, int centerY, int radius) {
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;
        }

        public void initialize(int centerX, int centerY, int radius, int widht) {
            this.initialize(centerX, centerY, radius);
            this.widht = widht;
        }

        public void initialize(int centerX, int centerY, int radius, int widht, int color) {
            this.initialize(centerX, centerY, radius, widht);
            this.color = color;
        }

    }
}
