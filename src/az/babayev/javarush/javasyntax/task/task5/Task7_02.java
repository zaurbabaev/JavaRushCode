package az.babayev.javarush.javasyntax.task.task5;

/*
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес (чужой домашний кот)

Задача инициализатора - сделать объект валидным.
Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касается возраста и цвета.
А вот имени может и не быть (null).
То же касается адреса: null.
 */
public class Task7_02 {

    public static class Cat {
        String name;
        int age;
        int weight;

        String color;
        String address;

        public void initialize(String name) {
            this.name = name;
            this.age = 2;
            this.weight = 2;
            this.color = "color";
        }

        public void initialize(String name, int weight, int age) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.color = "color";
        }

        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;
            this.weight = 3;
            this.color = "yellow";
        }

        public void initialize(int weight, String color) {
            this.age = 2;
            this.weight = weight;
            this.color = color;
        }

        public void initialize(int weight, String color, String address) {
            this.age = 2;
            this.weight = weight;
            this.color = color;
            this.address = address;
        }

        public static void main(String[] args) {
            Cat cat = new Cat();
            cat.initialize("Barsik");
            Cat cat2 = new Cat();
            cat2.initialize("Tom", 5, 3);
            Cat cat3 = new Cat();
            cat3.initialize("Barsik", 3);
            Cat cat4 = new Cat();
            cat4.initialize(3, "black");
            Cat cat5 = new Cat();
            cat5.initialize(3, "black", "Dom");
        }


    }
}
