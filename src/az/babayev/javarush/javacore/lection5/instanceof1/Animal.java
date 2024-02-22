package az.babayev.javarush.javacore.lection5.instanceof1;

public class Animal {
    public void doAnimalActions() {

    }
}

class Cat extends Animal {
    public void doCatActions() {

    }
}

class Tiger extends Cat {
    public void doTigerActions() {

    }
}

class Solution {
    public static void main(String[] args) {
        //Upcasting расширение типа (оно же — восходящее преобразование)
        Animal animal = new Tiger();
        Cat cat = new Tiger();
        Tiger tiger = new Tiger();
        Object obj = new Tiger();


        //Downcasting сужение типа (оно же — нисходящее преобразование)
        Animal animal2 = (Animal) obj;
        Cat cat2 = (Cat) obj;
        Tiger tiger1 = (Tiger) cat;
        Tiger tiger2 = (Tiger) animal;
    }
}
