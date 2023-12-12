package az.babayev.javarush.javasyntax.task.task08;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
Реализовать 4 метода.
Каждый из них должен возвращать список, который лучше всего подходит
для выполнения данных операций (быстрее всего справится с большим
количеством операций). Ничего измерять не нужно.
 */
public class Task6_05 {
    public static List getListForGet() {
        return new ArrayList();
    }

    public static List getListForSet() {
        return new ArrayList();
    }

    public static List getListForAddOrInsert() {
        return new LinkedList();
    }

    public static List getListForRemove() {
        return new LinkedList();
    }

    public static void main(String[] args) {

    }
}
