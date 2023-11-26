package az.babayev.javarush.javasyntax.task.task5;

/*
Реализуй метод boolean fight(Cat anotherCat):
продумай механизм драки котов в зависимости от их веса, возраста и силы.
Сравни каждый критерий по отдельности, чтобы победителем был тот,
у кого были лучшие показатели по большинству критериев.
Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если проиграли.
Если ничья и никто не выиграл, возвращаем false.
 */
public class Task5_02 {

    public static class Cat {
        public int age;
        public int weight;

        public int strength;

        public Cat() {

        }

        public boolean fight(Cat anotherCat) {
            return Integer.compare(this.weight, anotherCat.weight) +
                    Integer.compare(this.age, anotherCat.age) +
                    Integer.compare(this.strength, anotherCat.strength) > 0;

        }

        public static void main(String[] args) {
            Cat cat1 = new Cat();
            cat1.weight = 40;
            cat1.age = 3;
            cat1.strength = 12;


            Cat cat2 = new Cat();
            cat2.weight = 30;
            cat2.age = 3;
            cat2.strength = 12;
            boolean cat1Bool = cat1.fight(cat2);
            boolean cat2Bool = cat2.fight(cat1);
            System.out.println(cat1Bool);
            System.out.println(cat2Bool);

        }
    }
}
