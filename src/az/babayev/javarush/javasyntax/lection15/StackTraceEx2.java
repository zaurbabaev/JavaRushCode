package az.babayev.javarush.javasyntax.lection15;

public class StackTraceEx2 {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (StackTraceElement info : stackTrace) {
            System.out.println(info);
        }
    }
}
