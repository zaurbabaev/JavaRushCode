package az.babayev.javarush.javacore.task.task5.task1518;

public class Solution {
    public static Cat cat;

    public static class Cat {

        public String name;

    }

    static {
        cat = new Cat();
        cat.name = "Tom";
        System.out.println(cat.name);
    }

    public static void main(String[] args) {

    }
}
