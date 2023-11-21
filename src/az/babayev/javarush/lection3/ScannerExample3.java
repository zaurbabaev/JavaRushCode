package az.babayev.javarush.lection3;

import java.util.Scanner;

public class ScannerExample3 {
    public static void main(String[] args) {
        String someNumber = ("10 20 30 40 50");
        Scanner scanner = new Scanner(someNumber);
        String firstNumber = scanner.nextLine(); 
        System.out.println(firstNumber); // 10 20 30 40 50



    }
}
