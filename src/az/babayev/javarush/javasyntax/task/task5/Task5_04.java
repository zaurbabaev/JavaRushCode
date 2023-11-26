package az.babayev.javarush.javasyntax.task.task5;
/*
Пару задач назад студенты секретного центра JavaRush создавали класс Cat.
Теперь пришла пора реализовать котов во плоти, разумеется по образу и подобию класса Cat,
а точнее - основываясь на нём, как на шаблоне. Их - котов - должно быть трое.
Наполните этих троих жизнью, то есть, конкретными данными.
 */
public class Task5_04 {
    public static void main(String[] args) {
        Cat cat1=new Cat("Barsik",3,4,60);
        Cat cat2=new Cat("Barsik",3,4,60);
        Cat cat3=new Cat("Barsik",3,4,60);
    }
    public static class Cat{
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
