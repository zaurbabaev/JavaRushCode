package az.babayev.javarush.lection3;

import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {
        String someNumber = ("10 20 30 40 50");
        Scanner scanner = new Scanner(someNumber);
        int firstNumber = scanner.nextInt(); //10
        int secondNumber = scanner.nextInt(); //20
        secondNumber=scanner.nextInt(); // 30
        secondNumber=scanner.nextInt(); // 40
        secondNumber=scanner.nextInt(); // 50
        System.out.println(firstNumber + secondNumber);


    }
}
