package az.babayev.javarush.javasyntax.task.task7;

/*
Калькулятором, который умеет возводить число в третью степень, никого не удивишь.
Калькулятор, который может возвести число в девятую степень — другое дело! Так давай реализуем его!
Для этого создай метод public static long ninthDegree(long).
В качестве аргумента он должен принимать целочисленное значение типа long.
Метод должен возводить полученное значение в девятую степень и возвращать его как результат работы метода.
Школьный курс арифметики гласит: чтобы получить девятую степень, число нужно возвести в третью степень и
полученный результат еще раз возвести в третью степень.
Воспользуемся этим правилом в нашей программе.
В методе ninthDegree() возведи переданный аргумент в третью степень, воспользовавшись методом cube(),
полученный результат снова передай в метод cube(). Окончательный результат верни как результат работы метода.
 */
public class CubicCalculatorEx2 {

    public static long cube(long a) {
        return a * a * a;
    }

    public static long ninthDegree(long l) {
        return cube(cube(l));
    }


    public static void main(String[] args) {
        long cube = cube(2);
        System.out.println(cube);
        long l = ninthDegree(2);
        System.out.println(l);
    }
}