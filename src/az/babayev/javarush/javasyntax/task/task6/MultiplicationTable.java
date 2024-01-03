package az.babayev.javarush.javasyntax.task.task6;

/*
Проинициализируй массив MULTIPLICATION_TABLE значением new int[10][10],
заполни его таблицей умножения и выведи в консоли в следующем виде:
1 2 3 4 …
2 4 6 8 …
3 6 9 12 …
4 8 12 16 …
…
Числа в строке разделены пробелом.

 */
public class MultiplicationTable {

    public static int[][] multiplicationTable;

    public static void main(String[] args) {
        multiplicationTable = new int[10][10];
        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable[i].length; j++) {
                multiplicationTable[i][j] = (i+1) * (j+1);
                System.out.print(multiplicationTable[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
