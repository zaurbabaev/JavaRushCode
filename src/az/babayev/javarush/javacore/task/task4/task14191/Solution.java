package az.babayev.javarush.javacore.task.task4.task14191;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class Solution {
    public static List<Exception> exceptions = new ArrayList<>();

    public static void main(String[] args) {
        initExceptions();
        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            String s = null;
            s.length();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int[] array = new int[3];
            array[3] = 4;
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            ArrayList<Integer> integers = new ArrayList<>();
            integers.remove(3);
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            Object object = 12;
            String integer = (String) object;
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new NoSuchMethodException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int[] array = new int[-23];
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new ConcurrentModificationException();

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new InterruptedException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new SecurityException();
        } catch (Exception e) {
            exceptions.add(e);
        }
    }
}
