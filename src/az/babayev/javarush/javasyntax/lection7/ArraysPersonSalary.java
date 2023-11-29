package az.babayev.javarush.javasyntax.lection7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Işçilərin soyadları və onların maaşları
 */
public class ArraysPersonSalary {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input persons count:");
        int personCount = Integer.parseInt(reader.readLine());
        String[] persons = new String[personCount];
        int[] salary = new int[persons.length];
        for (int i = 0; i < persons.length; i++) {
            System.out.print("Input lastname for persons #" + i + ":");
            persons[i] = reader.readLine();
        }

        for (int i = 0; i < salary.length; i++) {
            System.out.print("Input salary for " + persons[i] + ":");
            salary[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i] + " have salary $" + salary[i]);
        }

        System.out.println("Find salary:(input lastname)");
        String lastname = reader.readLine();
        for (int i = 0; i < persons.length; i++) {
            if (lastname.equals(persons[i])) {
                System.out.println(persons[i] + " have salary $" + salary[i]);
            }
        }
    }
}
