package az.babayev.javarush.javasyntax.repetition.collections;

import java.util.ArrayList;

public class VarExample {
    public static void main(String[] args) {
        var elements=new ArrayList<>();
        elements.add(new Integer[18]);
        elements.add(10);
        elements.add("Hello");
        elements.add(new LinkageError());
        checkElementsType(elements);
    }

    public static void checkElementsType(ArrayList<Object> elements) {
        for (Object element : elements) {
            if (element instanceof String) {
                printString();
            } else if (element instanceof Integer) {
                printInteger();
            } else if (element instanceof Integer[]) {
                printIntegerArray();
            } else {
                printUnknown();
            }
        }
    }

    public static void printString() {
        System.out.println("This is String");
    }


    public static void printInteger() {
        System.out.println("This is Integer");
    }


    public static void printIntegerArray() {
        System.out.println("This is array Integers");
    }


    public static void printUnknown() {
        System.out.println("This is Unknown type");
    }
}
