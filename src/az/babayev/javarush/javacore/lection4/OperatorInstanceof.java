package az.babayev.javarush.javacore.lection4;

import java.io.FileNotFoundException;

public class OperatorInstanceof {
    public static void main(String[] args) {
        Object o = new Integer(3);
        boolean isInt = o instanceof Integer;
        System.out.println(isInt);

        System.out.println("-".repeat(30));

        Object s = "Hello";
        boolean isString = s instanceof String;
        System.out.println(isString);

        System.out.println("-".repeat(30));

        boolean isInt2=s instanceof Integer;
        System.out.println(isInt2);

        System.out.println("-".repeat(30));



    }
}
