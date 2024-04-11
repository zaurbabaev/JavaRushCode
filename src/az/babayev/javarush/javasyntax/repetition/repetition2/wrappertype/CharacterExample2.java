package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype;

public class CharacterExample2 {
    public static void main(String[] args) {
        compare('a', 'a');
        compare('a', 'b');
        compare('z', 'v');
        compare('d', 'z');

    }

    private static void compare(Character first, Character second) {
        if (first.equals(second)) {
            System.out.println("equals");
        } else if (first > second) {
            System.out.println("Big");
        } else {
            System.out.println("Less");
        }
    }
}
