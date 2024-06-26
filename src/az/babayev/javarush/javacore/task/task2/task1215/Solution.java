package az.babayev.javarush.javacore.task.task2.task1215;

/*
Унаследуй классы Cat и Dog от Pet.
Реализуй недостающие методы. Классы Cat и Dog не должны быть абстрактными.
 */
public class Solution {
    public static void main(String[] args) {
    }

    public static abstract class Pet {

        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {

        @Override
        public String getName() {
            return "null";
        }

        @Override
        public Pet getChild() {
            return new Cat();
        }
    }

    public static class Dog extends Pet {

        @Override
        public String getName() {
            return "null";
        }

        @Override
        public Pet getChild() {
            return new Dog();
        }
    }
}
