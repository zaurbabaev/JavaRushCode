package az.babayev.javarush.javasyntax.lection15;

import java.awt.*;

public class StackTraceEx {
    public static void main(String[] args) {
        // birinci usul
        StackTraceElement[] methods = Thread.currentThread().getStackTrace();
        // 2ci usul
        Thread thread = Thread.currentThread();
        StackTraceElement[] methods1 = thread.getStackTrace();
    }
}
