package az.babayev.javarush.javasyntax.task.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вывести любое из них.
 */
public class Task16_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string1 = bufferedReader.readLine();
        String string2 = bufferedReader.readLine();
        String string3 = bufferedReader.readLine();
        int number1 = Integer.parseInt(string1);
        int number2 = Integer.parseInt(string2);
        int number3 = Integer.parseInt(string3);

        int maximum = (number1 > number2) ?
                (number1 > number3 ?
                        number1 : number3) :
                (number2 > number3 ?
                        number2 : number3);


        int minimum = (number1 < number2) ?
                (number1 < number3 ?
                        number1 : number3) :
                (number2 < number3 ?
                        number2 : number3);

        int middle = (number1 + number2 + number3) - (maximum + minimum);

        System.out.println(middle);

    }
}
