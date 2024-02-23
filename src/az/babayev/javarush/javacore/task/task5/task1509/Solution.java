package az.babayev.javarush.javacore.task.task5.task1509;

public class Solution {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();
        printName(man);
        printName(woman);
    }


    public static void printName(Human human) {
        System.out.println(human.getClass().getSimpleName());
    }

    public static class Human {

    }

    public static class Man extends Human {

    }

    public static class Woman extends Human {

    }


}
