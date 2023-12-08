package az.babayev.javarush.javasyntax.lection16;

public class CharacterDemo {
    public static void main(String[] args) {
        boolean alphabetic = Character.isAlphabetic(64);
        System.out.println("isAlphabetic -> " + alphabetic);
        System.out.println("-".repeat(20));
        boolean letter = Character.isLetter('A');
        System.out.println("isLetter -> " + letter);
        System.out.println("-".repeat(20));
        boolean digit = Character.isDigit('4');
        System.out.println("isDigit -> " + digit);
        System.out.println("-".repeat(20));
        boolean spaceChar = Character.isSpaceChar('\n');
        System.out.println("isSpaceChar -> " + spaceChar);
        System.out.println("-".repeat(20));
        boolean whitespace = Character.isWhitespace('\t');
        System.out.println("isWhiteSpace -> " + whitespace);
        System.out.println("-".repeat(20));
        boolean lowerCase = Character.isLowerCase('a');
        System.out.println("isLowerCase -> " + lowerCase);
        System.out.println("-".repeat(20));
        boolean upperCase = Character.isUpperCase('A');
        System.out.println("isUpperCase -> " + upperCase);
        System.out.println("-".repeat(20));
        char lowerCase1 = Character.toLowerCase('A');
        System.out.println("LowerCase -> " + lowerCase1);
        System.out.println("-".repeat(20));
        char upperCase1 = Character.toUpperCase('a');
        System.out.println("Uppercase -> " + upperCase1);


    }
}
