package az.babayev.javarush.javasyntax.task.task10;

/*
В классе Solution объявлены и проинициализированы семь публичных полей.
Они инициализируются разными значениями — литералами с плавающей точкой.
Но программа не компилируется, и нужно это исправить.
 Для этого измени типы полей, чтобы они соответствовали значениям. Имена и значения полей не изменяй.
 */
public class LiteralDouble {
    public double a = 0.;
    public double b = .0;
    public double c = 100D;
    public double d = 100.0;
    public double e = 1.11E5;
    public float f = 200F;
    public float g = 0.F;
}
