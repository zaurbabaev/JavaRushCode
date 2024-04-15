package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype.exception.lion;

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat(new Food("мясо"));
        lion.eat(null);
    }
}
