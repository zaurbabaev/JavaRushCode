package az.babayev.javarush.javasyntax.task.task08;

/*
Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать свой StackTrace.
 */
public class Task11_13 {
    public static void main(String[] args) {
        StackTraceElement[] stackTraceElements = method1();
        for (StackTraceElement stackTraceElement : stackTraceElements) {
            System.out.println(stackTraceElement.getMethodName());
        }
    }

    public static StackTraceElement[] method1() {
        method2();
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method2() {
        method3();
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method3() {
        method4();
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method4() {
        method5();
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method5() {
        return Thread.currentThread().getStackTrace();
    }
}
