package az.babayev.javarush.javasyntax.repetition.wraper_type;


public class CharacterExample2 {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей. Только говорите никому, что она возникла случайно.";
        System.out.format("Количество цифр в строке: %d \n", countDigits(string));
        System.out.format("Количество букв в строке: %d \n", countLetters(string));
        System.out.format("Количество пробелов в строке: %d \n", countSpaces(string));

    }

    private static int countSpaces(String string) {
        int count = 0;
        char[] chars = string.toCharArray();
        for (char aChar : chars) {
            if (Character.isSpaceChar(aChar)) {
                count++;
            }
        }
        return count;
    }

    private static int countLetters(String string) {
        int count = 0;
        char[] chars = string.toCharArray();
        for (char aChar : chars) {
            if (Character.isLetter(aChar)) {
                count++;
            }
        }

        return count;
    }

    private static int countDigits(String string) {
        int count = 0;
        char[] chars = string.toCharArray();
        for (char aChar : chars) {
            if (Character.isDigit(aChar)) {
                count++;
            }
        }
        return count;
    }
}
