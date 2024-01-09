package az.babayev.javarush.javasyntax.task.task09;

/*
Закомментируй ненужные строки кода, чтобы на экран вывелась цифра 5.
Примечание: нужно закомментировать только две строки.
 */
public class BitwiceOperators {
    public static void main(String[] args) {
        int x = 7;
       // x = x & 25; //1
        x = x & 5; //5
//        x = x & 3;//1
        x = x & 12; //0
        x = x | 1; //1
        System.out.println(x);
    }
}
