package az.babayev.javarush.javasyntax.lection7;

public class ContainerTest {
    public static void main(String[] args) {
        Container<String> container = new Container<>();
        container.value = "Hello";
        container.print();
    }
}
