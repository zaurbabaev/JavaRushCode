package az.babayev.javarush.javasyntax_repetition.lection9;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String myString = " ";
        System.out.println(myString.length());
        System.out.println(myString.isBlank());
        System.out.println(myString.isEmpty());

        System.out.println("-".repeat(30));
        String myString2 = "abcdefg";
        System.out.println("get char at -> " + myString2.charAt(3));

        System.out.println("-".repeat(30));
        System.out.print("get chars -> ");
        char[] alphabet = myString2.toCharArray();
        for (char letter : alphabet) {
            System.out.print(letter + " ");
        }
        System.out.println();

        System.out.println("-".repeat(30));
        System.out.print("get bytes -> ");
        String alphaber2 = "abcdefg";
        byte[] bytes = alphaber2.getBytes();
        for (byte aByte : bytes) {
            System.out.print(aByte + " ");
        }
        System.out.println();

        System.out.println("-".repeat(30));
        System.out.print("split -> ");
        String myString3 = "Some text and some more text";
        String[] words = myString3.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println("-".repeat(30));
        System.out.print("join -> ");
        String words2 = String.join(" ", ".first text.", ".last text.");
        System.out.println(words2);

        System.out.println("-".repeat(30));
        System.out.print("replace -> ");
        String myString4 = "Some text and some more text";
        String replaced = myString4.replace("text", "word");
        System.out.println(replaced);

        System.out.println("-".repeat(30));
        System.out.print("substring -> ");
        String myString5 = "Some text and some more text";
        String substring = myString5.substring(0, 5);
        System.out.println(substring);

        System.out.println("-".repeat(30));
        System.out.print("toLowerCase -> ");
        String myString6 = "Some text and some more text";
        String toLowercase = myString6.toLowerCase();
        System.out.println(toLowercase);

        System.out.println("-".repeat(30));
        System.out.print("toUpperCase -> ");
        String myString7 = "Some text and some more text";
        String toUpperCase = myString7.toUpperCase();
        System.out.println(toUpperCase);

        System.out.println("-".repeat(30));
        System.out.print("trim -> ");
        String myString8 = " Some text and some more text    ";
        String trim = myString7.trim();
        System.out.println(trim);

        System.out.println("-".repeat(30));
        System.out.print("concat -> ");
        String myString9 = " Some text and some more text    ";
        String concat = myString7.concat(" and some more text");
        System.out.println(concat);

    }
}
