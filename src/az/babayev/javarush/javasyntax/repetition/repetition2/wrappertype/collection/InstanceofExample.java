package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype.collection;

import java.util.ArrayList;
import java.util.Collections;

public class InstanceofExample {
    public static void main(String[] args) {
        var elements = new ArrayList<>();
        Collections.addAll(elements,"hello", 10, new Integer[15], new LinkageError());

        checkElementsType(elements);
    }

    public static void checkElementsType(ArrayList<Object> list) {
        for (Object o : list) {
            if (o instanceof String) {
                printString();
            } else if (o instanceof Integer) {
                printInteger();
            } else if (o instanceof Integer[]) {
                printArray();
            } else {
                printUnknown();
            }
        }
    }

    public static void printString() {
        System.out.println("String");
    }

    public static void printInteger() {
        System.out.println("Integer");
    }

    public static void printArray() {
        System.out.println("Array");
    }

    public static void printUnknown() {
        System.out.println("Unknown");
    }

}
