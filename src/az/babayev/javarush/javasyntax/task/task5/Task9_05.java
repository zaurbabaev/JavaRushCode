package az.babayev.javarush.javasyntax.task.task5;

/*
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width,
height (верхняя координата, левая, ширина и высота).
Создать для него как можно больше методов конструкторов.

Примеры:
- заданы 4 параметра: left, top, width, height
- ширина/высота не задана (оба равны 0)
- высота не задана (равно ширине) создаём квадрат
- создаём копию другого прямоугольника (он и передаётся в параметрах)
 */
public class Task9_05 {
    public static class Rectangle {
        int top;
        int left;
        int width;
        int height;

        public Rectangle(int top, int left, int width, int height) {
            this.top = top;
            this.left = left;
            this.width = width;
            this.height = height;
        }

        public Rectangle(int top, int left) {
            this.top = top;
            this.left = left;
            this.width = 0;
            this.height = 0;
        }

        public Rectangle(int top, int left, int width) {
            this.top = top;
            this.left = left;
            this.width = width;
            this.height = width;
        }

        public Rectangle(Rectangle rectangle) {
            this(rectangle.top, rectangle.left, rectangle.width, rectangle.height);
        }
    }
}
