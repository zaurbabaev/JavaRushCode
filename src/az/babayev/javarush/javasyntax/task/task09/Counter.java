package az.babayev.javarush.javasyntax.task.task09;

/*
В классе Counter реализуй метод printNumbers(), который выводит числа от 1 до 10 включительно с
паузой между выводом каждого числа — 1,3 миллисекунды.
В этом тебе поможет метод sleep(long, int) класса Thread, который должен сработать 9 раз.
 */
public class Counter {
    public static void printNumbers() throws InterruptedException {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
            if (i < 10) {
                Thread.sleep(1, 300_000);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        printNumbers();
    }
}
