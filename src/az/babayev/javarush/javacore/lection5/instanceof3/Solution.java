package az.babayev.javarush.javacore.lection5.instanceof3;

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat instanceof Animal);
        System.out.println(cat instanceof MaineCoon);

        Cat cat1 = new MaineCoon();
        System.out.println(cat1 instanceof Cat);
        System.out.println(cat1 instanceof MaineCoon);

        Animal animal= new Animal();

        System.out.println(animal instanceof Cat);




    }
}
