package az.babayev.javarush.javasyntax.task.task15.exception_ex;

/*
Сделай так, чтобы программа компилировалась, не используя try-catch.
 */
public class ExceptionExample5 {
    public static void main(String[] args) throws Exception {
        generateLuckyNumber();
    }

    static void generateLuckyNumber() throws Exception {
        int luckyNumber = (int) (Math.random() * 100);
        if (luckyNumber == 13) {
            throw new Exception("не повезло");
        }
        System.out.println("твое счастливое число: " + luckyNumber);
    }
}
