package az.babayev.javarush.javacore.task.task2.task1204;

/*
Напиши метод, который определяет, объект какого класса ему передали,
и выводит на экран одну из надписей: Кошка, Собака, Птица, Лампа.
 */
public class Solution {
    public static void main(String[] args) {
        printObjectType2(new Cat());
        printObjectType2(new Dog());
        printObjectType2(new Bird());
        printObjectType2(new Lamp());
    }

    public static void printObjectType(Object o) {
        if (o instanceof Cat) {
            Cat cat = (Cat) o;
            System.out.println(cat);
        } else if (o instanceof Dog) {
            Dog dog = (Dog) o;
            System.out.println(dog);
        } else if (o instanceof Bird) {
            Bird bird = (Bird) o;
            System.out.println(bird);
        } else if (o instanceof Lamp) {
            Lamp lamp = (Lamp) o;
            System.out.println(lamp);
        }
    }

    // JDK 16-dan sonra olan dəyişiklik cast etməyə ehtiyac yoxdur
    // sadəcə olaraq tipdən sonra onun dəyişəninidə yazırıq 
    public static void printObjectType2(Object o) {
        if (o instanceof Cat cat) {
            System.out.println(cat);
        } else if (o instanceof Dog dog) {
            System.out.println(dog);
        } else if (o instanceof Bird bird) {
            System.out.println(bird);
        } else if (o instanceof Lamp lamp) {
            System.out.println(lamp);
        }
    }
}
