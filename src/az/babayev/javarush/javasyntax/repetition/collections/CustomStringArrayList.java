package az.babayev.javarush.javasyntax.repetition.collections;

import java.util.Arrays;

public class CustomStringArrayList {
    private int size = 0;
    private int capacity = 10;
    private String[] elements = new String[capacity];


    public void add(String element) {
        if (capacity == size) {
            grow();
        }
        elements[size++] = element;
    }

    public void grow() {
        capacity = (int) (capacity * 1.5) + 1;
        String[] newArray = new String[capacity];
        System.arraycopy(elements, 0, newArray, 0, size);
        elements = newArray;
    }

    @Override
    public String toString() {
        return "CustomStringArrayList{" +
                "size=" + size +
                ", capacity=" + capacity +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }

    public static void main(String[] args) {
        CustomStringArrayList stringArrayList = new CustomStringArrayList();
        for (int i = 0; i < 11; i++) {
            stringArrayList.add("Hello");
        }

        System.out.println(stringArrayList);
    }
}
