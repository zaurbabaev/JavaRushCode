package az.babayev.javarush.javasyntax.task.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.
 */
public class Task6_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string1 = bufferedReader.readLine();
        String string2 = bufferedReader.readLine();
        String string3 = bufferedReader.readLine();
        String string4 = bufferedReader.readLine();
        int firstNumber = Integer.parseInt(string1);
        int secondNumber = Integer.parseInt(string2);
        int thirdNumber = Integer.parseInt(string3);
        int fourthNumber = Integer.parseInt(string4);
//        int result = firstNumber > secondNumber ? firstNumber :
//                secondNumber > thirdNumber ? secondNumber :
//                        thirdNumber > fourNumber ? thirdNumber : fourNumber;
        int result = Math.max(firstNumber, Math.max(secondNumber, Math.max(thirdNumber, fourthNumber)));
        System.out.println(result);
    }


}

