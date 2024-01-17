package az.babayev.javarush.javasyntax.task.task13;

/*
Реализуй методы countDigits(String), countLetters(String), countSpaces(String),
которые должны возвращать количество цифр, букв и пробелов в строке.
Метод main не принимает участия в проверке.
 */
public class AnalizeString {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
//        int count = 0;
//        char[] chars = string.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if (Character.isDigit(chars[i])) {
//                count++;
//            }
//        }
//        return count;
        return (int) string.chars()
                .filter(Character::isDigit)
                .count();
    }

    public static int countLetters(String string) {
        int count = 0;
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                count++;
            }
        }
        return count;
//        return (int) string.chars()
//                .filter(Character::isLetter)
//                .count();
    }

    public static int countSpaces(String string) {
//        int count = 0;
//        char[] chars = string.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if (Character.isSpaceChar(chars[i])) {
//                count++;
//            }
//        }
//        return count;
        return (int) string.chars()
                .filter(Character::isSpaceChar)
                .count();
    }
}

