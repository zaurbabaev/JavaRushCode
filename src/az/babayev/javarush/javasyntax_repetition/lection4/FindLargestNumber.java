package az.babayev.javarush.javasyntax_repetition.lection4;

public class FindLargestNumber {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 30;
        if (num1 > num2) {
            System.out.println(num1 + " biggest " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " biggest " + num1);
        } else {
            System.out.println("numbers are equal");
        }
    }
}
