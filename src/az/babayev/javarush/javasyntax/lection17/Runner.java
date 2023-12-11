package az.babayev.javarush.javasyntax.lection17;

public class Runner {
    public static void main(String[] args) {
        new ValueObject<String>("Hello").printToConsole();
        new ValueObject<Boolean>(false).printToConsole();
        new ValueObject<Float>(3.14f).printToConsole();
        new ValueObject<Character>('A').printToConsole();
    }
}
