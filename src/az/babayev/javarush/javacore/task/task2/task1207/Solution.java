package az.babayev.javarush.javacore.task.task2.task1207;

/*
Реализуй два метода: print(int) и print(Integer).
Напиши такой код в методе main(), чтобы вызвались оба.
 */
public class Solution {
    public static void main(String[] args) {
        print(2);
        print(Integer.valueOf(5));
    }

    public static void print(int i) {
        System.out.println(i);
    }

    public static void print(Integer i) {
        System.out.println(i);
    }
}
