package az.babayev.javarush.javasyntax.lection10;

public class StringBuilderEx1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.println(stringBuilder);
        stringBuilder.append("How are you");
        System.out.println(stringBuilder);
        stringBuilder.append(123);
        System.out.println(stringBuilder);

        String resultInString = stringBuilder.toString();
        System.out.println(resultInString);
    }
}
