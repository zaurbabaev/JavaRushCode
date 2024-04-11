package az.babayev.javarush.javasyntax.repetition.repetition2.wrappertype;

public class CharacterExample {

    public static void main(String[] args) {
        String string = """
                Думаю, это будет новой фичей.
                Только не говорите никому, что она возникла случайно.""";


        System.out.format("Количество цифр в строке : %d \n", countDigits(string));
        System.out.format("Количество букв в строке : %d \n", countLetters(string));
        System.out.format("Количество пробелов в строке : %d \n ", countSpaces(string));
    }

    private static int countDigits(String string) {
        int count = 0;
        char[] charArray = string.toCharArray();
        for (char c : charArray) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }

    private static int countLetters(String string) {
        int count = 0;
        char[] charArray = string.toCharArray();
        for (char c : charArray) {
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }

    private static int countSpaces(String string) {
        int count = 0;
        char[] charArray = string.toCharArray();
        for (char c : charArray) {
            if (Character.isSpaceChar(c)) {
                count++;
            }
        }
        return count;
    }

}
