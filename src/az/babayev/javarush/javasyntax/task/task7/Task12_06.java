package az.babayev.javarush.javasyntax.task.task7;

import java.util.ArrayList;
import java.util.Arrays;

/*
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Task12_06), мать(Task12_06).
 Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
 Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при
выводе объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
...
 */
public class Task12_06 {
    public static void main(String[] args) {
        Human gp1 = new Human("Vitaliy", true, 80);
        Human gp2 = new Human("Anatoliy", true, 85);
        Human gm1 = new Human("Valide", false, 80);
        Human gm2 = new Human("Anya", false, 75);
        Human father = new Human("Yuriy", true, 50, gp1, gm1);
        Human mother = new Human("Marina", false, 45, gp2, gm2);
        Human son1 = new Human("Mike", true, 20, father, mother);
        Human son2 = new Human("Yura", true, 25, father, mother);
        Human daughter = new Human("Nata", false, 15, father, mother);
        ArrayList<Human> human = new ArrayList<>();
        human.addAll(Arrays.asList(gp1, gp2, gm1, gm2, father, mother, son1, son2, daughter));

        for (Human human1 : human) {
            System.out.println(human1);
        }
    }


    public static class Human {

        public String name;
        public boolean sex;
        public int age;

        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this(name, sex, age);
            this.father = father;
            this.mother = mother;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }

}
