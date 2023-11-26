package az.babayev.javarush.javasyntax.task.task5;

/*
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
 */
public class Task9_03 {

    public static class Dog {
        String name;
        int height;
        String color;

        public Dog(String name) {
            this.name = name;
        }

        public Dog(String name, int height) {
            this(name);
            this.height = height;
        }

        public Dog(String name, int height, String color) {
            this(name, height);
            this.color = color;
        }
    }
}
