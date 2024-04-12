package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype.collection.arraylist;

public class CustomArrayList<T> {

    private int capacity = 10;
    private int size = 0;
    private T[] elements = (T[]) new Object[capacity];

    public void add(T value) {
        if (size == capacity) {
            grow();
        }
        elements[size++] = value;
    }

    private void grow() {
        capacity = (int) (capacity * 1.5) + 1;
        T[] newElements = (T[]) new Object[capacity];
        System.arraycopy(elements, 0, newElements, 0, size);
        elements = newElements;
    }

}
