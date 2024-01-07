package az.babayev.javarush.javasyntax.task.task7;

/*
Давай напишем реализацию калькулятора, который будет считать степени чисел.
Для этого создай метод cube(). В качестве аргумента он должен принимать целочисленное значение типа long.
Метод должен возводить полученное значение в третью степень и возвращать его как результат работы метода.
Числа, которыми придется оперировать, могут быть большими. Поэтому метод cube() должен возвращать тип long
 */
public class CubicCalculator {

    public static long cube(long number) {
        return number * number * number;
    }

    public static void main(String[] args) {
        long cube = cube(2);
        System.out.println(cube);
    }
}
