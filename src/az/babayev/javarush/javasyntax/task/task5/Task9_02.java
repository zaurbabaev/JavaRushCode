package az.babayev.javarush.javasyntax.task.task5;

/*
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
- вес, цвет, адрес (чужой домашний кот)

Задача конструктора - сделать объект валидным.
Например, если вес не известен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касательно возраста. А вот имени может и не быть (null).
 То же касается адреса: null.
 */
public class Task9_02 {
    public static class Cat {
        String name;
        int age;
        int weight;
        String address;
        String color;

        public Cat(String name) {
            this.name = name;
            this.age = 2;
            this.weight = 3;
            this.color = "blue";
        }

        public Cat(String name, int weight, int age) {
            this(name, age);
            this.weight = weight;
            this.color = "blue";
        }

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
            this.weight = 3;
            this.color = "blue";
        }

        public Cat(int weight, String color) {
            this.weight = weight;
            this.color = color;
            this.age = 1;
        }

        public Cat(int weight, String color, String address) {
            this.weight = weight;
            this.color = color;
            this.address = address;
            this.age = 1;
        }


    }
}
