package az.babayev.javarush.javasyntax.task.task5;

/*
Создай классы Dog, Cat, Mouse.
Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри.
Так много, как только вспомнишь.

Пример:
Mouse jerryMouse = new Mouse("Jerry", 12 , 5),
где 12 - высота в см,
5 - длина хвоста в см.
 */
public class Task12_03 {

    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat tomCat = new Cat("Tom", 15, 6);
        Dog dog = new Dog("Dog", 15, 6);
    }
    public static class Dog {
        private String name;
        private int height;
        private int tail;

        public Dog(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getHeight() {
            return height;
        }

        public void setTail(int tail) {
            this.tail = tail;
        }

        public int getTail() {
            return tail;
        }

    }

    public static class Cat {
        private String name;
        private int height;
        private int tail;

        public Cat(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getHeight() {
            return height;
        }

        public void setTail(int tail) {
            this.tail = tail;
        }

        public int getTail() {
            return tail;
        }
    }

    public static class Mouse {
        private String name;
        private int height;
        private int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getHeight() {
            return height;
        }

        public void setTail(int tail) {
            this.tail = tail;
        }

        public int getTail() {
            return tail;
        }
    }

}
