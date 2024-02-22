package az.babayev.javarush.javacore.lection5.instanceof2;

public class Solution {

    public static void main(String[] args) {
        Animal animal = new Animal();
        doAllActions2(animal);
        System.out.println("-".repeat(20));

        Animal tiger = new Tiger();
        doAllActions2(tiger);
        System.out.println("-".repeat(20));

        Animal cat = new Cat();
        doAllActions2(cat);

    }

    // if ilə yazsaq Tiger həmçinin Cat və Animaldır. ona görədə ekranda Tiger, Animal və Cat
    // Cat həmdə Animaldır. Ona görə Cat və Animal görəcəyik
    // Animal 1 dəfə çapa veriləcək onu if daxilində yazmaq lazım deyil
    public static void doAllActions(Animal animal) {
        if (animal instanceof Tiger) {
            Tiger tiger = (Tiger) animal;
            tiger.doTigerAction();
        }
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.doCatAction();
        }
        animal.doAnimalAction();
    }


    // else if zamanı isə hansı tipə uyğundursa oda çapa veriləcək.
    // Animal, Tiger, Cat
    public static void doAllActions2(Animal animal) {
        if (animal instanceof Tiger) {
            Tiger tiger = (Tiger) animal;
            tiger.doTigerAction();
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.doCatAction();
        } else
            animal.doAnimalAction();
    }

    // Java 16da artıq castingə ehtiyac yoxdur instanceodan sonra birbaşa klas və referansı yazılır
    public static void doAllActions3(Animal animal) {
        if (animal instanceof Tiger tiger) {
            tiger.doTigerAction();
        } else if (animal instanceof Cat cat) {
            cat.doCatAction();
        } else
            animal.doAnimalAction();
    }


}
