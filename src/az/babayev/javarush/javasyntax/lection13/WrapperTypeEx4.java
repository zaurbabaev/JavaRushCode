package az.babayev.javarush.javasyntax.lection13;

public class WrapperTypeEx4 {
    public static void main(String[] args) {
        boolean alphabetic = Character.isAlphabetic('A');
        System.out.println(alphabetic);

        boolean letter = Character.isLetter(65);
        System.out.println(letter);

        boolean digit = Character.isDigit(2);
        System.out.println(digit);

        boolean spaceChar = Character.isSpaceChar(' ');
        System.out.println(spaceChar);

        boolean whitespace = Character.isWhitespace(' ');
        System.out.println(whitespace);

        boolean lowerCase = Character.isLowerCase('s');
        System.out.println(lowerCase);

        boolean upperCase = Character.isUpperCase('A');
        System.out.println(upperCase);

        char upperCase1 = Character.toUpperCase('a');
        System.out.println(upperCase1);
        
        char lowerCase1 = Character.toLowerCase('A');
        System.out.println(lowerCase1);

        Boolean aTrue = Boolean.TRUE;
        Boolean aFalse = Boolean.FALSE;



    }
}
