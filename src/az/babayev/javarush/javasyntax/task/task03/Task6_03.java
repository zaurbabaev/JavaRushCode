package az.babayev.javarush.javasyntax.task.task03;

/*
Создать 7 объектов, чтобы на экран вывелись 7 цветов радуги.
Пример вывода:
Red
Orange
Yellow
Green
Blue
Indigo
Violet
Каждый объект при создании выводит на экран определенный цвет.
 */
public class Task6_03 {
    public static void main(String[] args) {
        Red red = new Red();
        Orange orange = new Orange();
        Yellow yellow = new Yellow();
        Green green = new Green();
        Blue blue = new Blue();
        Indigo indigo = new Indigo();
        Violet violet = new Violet();
    }

    public static class Red {
        public Red() {
            System.out.println("Red");
        }
    }

    public static class Orange {
        public Orange() {
            System.out.println("Orange");
        }
    }

    public static class Yellow {
        public Yellow() {
            System.out.println("Yellow");
        }
    }

    public static class Green {
        public Green() {
            System.out.println("Green");
        }
    }

    public static class Blue {
        public Blue() {
            System.out.println("Blue");
        }
    }

    public static class Indigo {
        public Indigo() {
            System.out.println("Indigo");
        }
    }

    public static class Violet {
        public Violet() {
            System.out.println("Violet");
        }
    }
}
