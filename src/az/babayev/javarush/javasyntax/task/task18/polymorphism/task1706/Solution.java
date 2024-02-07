package az.babayev.javarush.javasyntax.task.task18.polymorphism.task1706;

/*
Перед тобой 4 класса животных — Cow, Lion, Wolf и Elephant. Корова (Cow) и
слон (Elephant) являются травоядными, поэтому они наследуются от класса Herbivore.
А лев (Lion) и волк (Wolf) являются хищниками, поэтому они наследуются от класса
Predator. В свою очередь классы Herbivore и Predator унаследованы от Animal.
В классе Solution реализуй метод printRation(Animal animal), который должен
выводить в консоли рацион переданного животного:

если животное хищник, нужно вывести "Любит мясо";
если животное травоядное, вывести "Любит траву".
 */
public class Solution {
    public static void main(String[] args) {
        printRation(new Cow());
        printRation(new Lion());
        printRation(new Elephant());
        printRation(new Wolf());
    }

    public static void printRation(Animal animal) {
        String herbivore = "Любит траву";
        String predator = "Любит мясо";
        if (animal instanceof Herbivore) {
            System.out.println(herbivore);
        }
        if (animal instanceof Predator) {
            System.out.println(predator);
        }
    }

}
