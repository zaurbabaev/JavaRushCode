package az.babayev.javarush.javasyntax.task.task02;
/*
Используя только оператор декремента, измени значение переменной toothCounter,
чтобы на экран вывелось число 23.
 */
public class ToothCount {
    public static void main(String[] args) {
        int toothCounter=32;
        --toothCounter;
        --toothCounter;
        --toothCounter;
        --toothCounter;
        --toothCounter;
        --toothCounter;
        --toothCounter;
        --toothCounter;
        --toothCounter;
        System.out.println(toothCounter);
    }
}
