package az.babayev.javarush.javacore.task.task4.task1402;

public class Solution {

    public static void main(String[] args) {
        Cat cat = new TomCat();

        boolean isCat = cat instanceof Cat;
        boolean isMovable = cat instanceof CanMove;
        boolean isTom = cat instanceof TomCat;

        if (isCat && isMovable && isTom) {
            System.out.println("Bingo!");
        }
    }
}
