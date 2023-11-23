package az.babayev.javarush.javasyntax.task.task03;

/*
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 4 ...
2 4 6 8 ...
3 6 9 12 ...
4 8 12 16 ...
 */
public class Task6_02 {

    public static void main(String[] args) {
        calculator(1);
        calculator(2);
        calculator(3);
        calculator(4);
        calculator(5);
        calculator(6);
        calculator(7);
        calculator(8);
        calculator(9);
        calculator(10);

    }

    public static void calculator(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i * number + " ");
        }
        System.out.println();
    }
}
