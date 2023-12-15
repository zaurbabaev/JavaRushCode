package az.babayev.javarush.javasyntax.lection19;

public class StackExample {
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        method2();
    }

    private static void method2() {
        method3();
    }

    private static void method3() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            System.out.println(stackTraceElement.getMethodName());
        }
    }
}
