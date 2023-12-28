package az.babayev.javarush.javasyntax.task.task08;

/*
Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.
 */
public class Task11_14 {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(stackTrace[2].getMethodName());
        return stackTrace[2].getMethodName();
    }

    public static String method2() {
        method3();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(stackTrace[2].getMethodName());
        return stackTrace[2].getMethodName();
    }

    public static String method3() {
        method4();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(stackTrace[2].getMethodName());
        return stackTrace[2].getMethodName();
    }

    public static String method4() {
        method5();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(stackTrace[2].getMethodName());
        return stackTrace[2].getMethodName();
    }

    public static String method5() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(stackTrace[2].getMethodName());
        return stackTrace[2].getMethodName();
    }
}
