package az.babayev.javarush.javasyntax.task.task09;

/*
В классе CountDown в методе countDown() происходит обратный отсчет.
 Тебе нужно сделать так, чтобы между выводом текста в консоль была пауза в 1 секунду.
 В этом тебе поможет метод sleep(long) класса Thread.
 */
public class CountDown {
    public static void main(String[] args) throws InterruptedException {
        countDown();
    }

    public static void countDown() throws InterruptedException {
        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Старт!");
    }
}
