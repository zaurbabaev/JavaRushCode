package az.babayev.javarush.javasyntax.task.task15.exception_ex;

/*
Перехвати исключение в методе main, чтобы программа компилировалась.
При возникновении исключения нужно вывести на экран строку errorMessage.
 */
public class ExceptionExample4 {
    public static String errorMessage = "не повезло";

    public static void generateLuckyNumber() throws Exception {
        int luckyNumber = (int) (Math.random() * 100);

        if (luckyNumber == 13) {
            throw new Exception();
        }
        System.out.println("твое счастливое число: " + luckyNumber);

    }

    public static void main(String[] args) {
        try {
            generateLuckyNumber();
        } catch (Exception e) {
            System.out.println(errorMessage);
        }
    }
}

