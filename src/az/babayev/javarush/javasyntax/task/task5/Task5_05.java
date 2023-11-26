package az.babayev.javarush.javasyntax.task.task5;

/*
Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран c новой строки.
 */
public class Task5_05 {
    public static void main(String[] args) {
        Cat cat1=new Cat("barsik",2,5,7);
        Cat cat2=new Cat("barsik",6,9,7);
        Cat cat3=new Cat("barsik",2,5,7);
        boolean fight1 = cat1.fight(cat2);
        System.out.println(fight1);
        boolean fight2 = cat2.fight(cat3);
        System.out.println(fight2);
        boolean fight3 = cat1.fight(cat3);
        System.out.println(fight3);
    }
    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strenght;

        public Cat(String name, int age, int weight, int strenght) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strenght = strenght;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int wighthScore = Integer.compare(this.weight, anotherCat.weight);
            int strenghtScore = Integer.compare(this.strenght, anotherCat.strenght);
            int score = ageScore + wighthScore + strenghtScore;
            return score > 0;// return score > 0 ? true:false;
        }
    }
}
