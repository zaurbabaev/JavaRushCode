package az.babayev.javarush.javasyntax.task.task08;

/*
Расставь операторы приведения типов в выражениях таким образом, чтобы код компилировался.
Изменять типы переменных a, b, c и d нельзя. Оператор приведения типа не должен отличаться от типа переменной.
 */
public class DataTypeEx2 {
    long a = 109 + 15;
    int b = (int) a * 2;
    short c = (short) (a / b);
    byte d = (byte) (a + b - c);
}
