package az.babayev.javarush.javacore.task.task2.task1214;
/*
Унаследуй класс Cow от Animal.
Реализуй все недостающие методы в классе Cow.
 */
public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Animal{
        public abstract String getName();
    }

    public static class Cow extends Animal{

        @Override
        public String getName() {
            return "Cow";
        }
    }
}
