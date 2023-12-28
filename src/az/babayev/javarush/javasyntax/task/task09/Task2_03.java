package az.babayev.javarush.javasyntax.task.task09;

/*
Написать пять методов, которые вызывают друг друга.
Метод должен вернуть номер строки кода, из которого вызвали этот метод.
Воспользуйся функцией: element.getLineNumber()
 */
public class Task2_03 {

    public static void main(String[] args) {
        method1();
    }

    public static int method1() {
        method2();
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        System.out.println(element[2].getLineNumber());
        return element[2].getLineNumber();
    }

    public static int method2() {
        method3();
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        System.out.println(element[2].getLineNumber());
        return element[2].getLineNumber();
    }

    public static int method3() {
        method4();
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        System.out.println(element[2].getLineNumber());
        return element[2].getLineNumber();
    }

    public static int method4() {
        method5();
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        System.out.println(element[2].getLineNumber());
        return element[2].getLineNumber();
    }

    public static int method5() {
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        System.out.println(element[2].getLineNumber());
        return element[2].getLineNumber();
    }
}
