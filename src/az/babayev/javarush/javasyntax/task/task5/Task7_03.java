package az.babayev.javarush.javasyntax.task.task5;

/*
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
 */
public class Task7_03 {
    public static class Dog {
        String name;
        int height;
        String color;

        public void initialize(String name) {
            this.name = name;
        }

        public void initialize(String name, int height) {
            this.name = name;
            this.height = height;
        }

        public void initialize(String name, int height, String color){
            this.name=name;
            this.height=height;
            this.color=color;
        }
    }
}
