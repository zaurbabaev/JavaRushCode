package az.babayev.javarush.javacore.task.task5.task1505;

public class Solution {
    public interface HasWeight {
        int getWeight();
    }

    public interface HasHeight {
        int getHeight();
    }

    public static class Human implements HasWeight,HasHeight{

        @Override
        public int getWeight() {
            return 65;
        }

        @Override
        public int getHeight() {
            return 178;
        }
    }

    public static void main(String[] args) {
        Human human=new Human();
        System.out.println(human.getHeight());
        System.out.println(human.getWeight());
    }

}
