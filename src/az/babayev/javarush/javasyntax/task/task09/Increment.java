package az.babayev.javarush.javasyntax.task.task09;
/*
Внеси исправления в метод main(), чтобы он выводил в консоли число 20.
В методе можно изменять только постинкремент на преинкремент и наоборот,
 а также постдекремент на предекремент и наоборот.
 */
public class Increment {
    public static void main(String[] args) {
        int a = 3;
        int b = ++a + (a-- * ++a);
        System.out.println(b);


    }
}
