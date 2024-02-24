package az.babayev.javarush.javacore.task.task5.task1517;

public class Solution {
    public static int A = 0;

    static {
        B = Solution.B / A;
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}
