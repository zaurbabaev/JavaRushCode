package az.babayev.javarush.javasyntax.task.task03;

/*
Вывести на экран сумму чисел от 1 до 5 построчно (должно быть 5 строк):
1
1+2=3
1+2+3=6
...
*/
public class Task4_05 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i <= 5; i++) {
            result += i;
            System.out.println(result);
        }
    }

}
