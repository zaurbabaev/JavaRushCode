package az.babayev.javarush.javasyntax.task.task04;

/*
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок (символ из горизонтальной строки не учитывается).
 */
public class Task13_04 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.print("8");
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println("8");
        }
    }
}
