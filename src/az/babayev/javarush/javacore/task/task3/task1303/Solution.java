package az.babayev.javarush.javacore.task.task3.task1303;

public class Solution {
    public static void main(String[] args) {
        print(new Beer());
        print(new Cola());
    }

    private static void print(Drink drink) {
        System.out.println(drink.getClass().getSimpleName());
    }
}
