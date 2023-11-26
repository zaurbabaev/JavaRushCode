package az.babayev.javarush.javasyntax.task.task5;

/*
Создать класс прямоугольник (Rectangle). Его данными будут top,
 left, width, height (верхняя координата, левая, ширина и высота).
Создать для него как можно больше методов initialize(...)
Примеры:
- заданы 4 параметра: left, top, width, height
- ширина/высота не задана (оба равны 0)
- высота не задана (равно ширине) создаём квадрат
- создаём копию другого прямоугольника (он и передаётся в параметрах)
 */
public class Task7_05 {
    public static class Rectangle {
        int top;
        int left;
        int widht;
        int height;

        public void initialize(int left, int top, int widht, int height) {
            this.left = left;
            this.top = top;
            this.widht = widht;
            this.height = height;
        }

        public void initialize(int left, int top) {
            this.left = left;
            this.top = top;
            this.height = 0;
            this.widht = 0;
        }

        public void initialize(int top, int left, int widht) {
            this.top = top;
            this.left = left;
            this.widht = widht;
            this.height = widht;
        }

        public void initialize(Rectangle rectangle) {
            this.widht = rectangle.widht;
            this.top = rectangle.top;
            this.left = rectangle.left;
            this.height = rectangle.height;
        }


    }
}
