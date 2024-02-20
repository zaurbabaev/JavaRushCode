package az.babayev.javarush.javacore.task.task4.task1401;

public class Solution {

    public static void main(String[] args) {
        Object animal = new Tiger();
        boolean isCat = animal instanceof Cat;
        boolean isTiger = animal instanceof Tiger;
        boolean isPet = animal instanceof Pet;

        printResults(isCat,isTiger,isPet);
    }

    private static void printResults(boolean cat, boolean tiger, boolean pet) {
        if (cat && tiger && pet) {
            System.out.println("Bingo!");
        }
    }

}
