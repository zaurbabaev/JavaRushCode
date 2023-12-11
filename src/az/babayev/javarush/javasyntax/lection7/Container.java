package az.babayev.javarush.javasyntax.lection7;

public class Container<T> {
    T value;

    public void print() {
        System.out.println(value.getClass().getSimpleName());
    }
}
