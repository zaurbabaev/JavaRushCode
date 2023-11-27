package az.babayev.javarush.javasyntax.task.task5;

/*
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name (String), age (int), address (String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате: name + " " + age + " " + address
 */
public class Task12_02 {

    public static void main(String[] args) {
        Man man1 = new Man("Zaur", 30, "Baku");
        Man man2 = new Man("Zaur", 30, "Baku");
        Woman woman1 = new Woman("Mariya", 25, "Baku");
        Woman woman2 = new Woman("Mariya", 25, "Baku");
    }
    public static class Man {
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
            System.out.println(name + " " + age + " " + address);
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public int getAge() {
            return age;
        }
    }

    public static class Woman {
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
            System.out.println(name + " " + age + " " + address);
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public int getAge() {
            return age;
        }
    }
}
