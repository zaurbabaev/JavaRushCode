package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype;

public class BooleanExample {
    public static void main(String[] args) {

        int first = 2;
        int second = 6;
        Boolean isLess = isLess(first, second);
        if (isLess) {
            System.out.println("First number less than second");
        } else {
            System.out.println("first number is greater than or equal to second number ");
        }
    }

    private static Boolean isLess(int first, int second) {
        return first < second;
    }


}
