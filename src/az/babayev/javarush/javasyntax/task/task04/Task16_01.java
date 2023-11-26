package az.babayev.javarush.javasyntax.task.task04;

/*
Используя цикл вывести на экран сто раз надпись:
"Я никогда не буду работать за копейки. Амиго"
Каждое значение вывести с новой строки.
 */
public class Task16_01 {
    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//            System.out.println("Я никогда не буду работать за копейки. Амиго");
//        }

        int i = 0;
        while (i < 100) {
            System.out.println("Я никогда не буду работать за копейки. Амиго");
            i++;
        }
    }
}
