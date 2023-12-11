package az.babayev.javarush.javasyntax.lection17;

public class ValueObject<T> {
    private T value;

    public ValueObject(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void printToConsole() {
        System.out.println(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
