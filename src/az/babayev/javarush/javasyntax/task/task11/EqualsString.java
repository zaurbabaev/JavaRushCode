package az.babayev.javarush.javasyntax.task.task11;
/*
В методе main объявлены переменные типа String.
В консоли выводится результат их сравнения:
если строки равны, выводится true, иначе — false.
Тебе нужно раскомментировать одну строку, чтобы получился следующий вывод:
true
true

Тело метода main менять нельзя: можно только раскомментировать одну строку.
 */
public class EqualsString {
    public static void main(String[] args) {
        String s1 = new String("JavaRush");
        s1 = "JavaRush";
        String s2 = "JavaRush";
//        s2 = new String("JavaRush");
        String s3 = "JavaRush";
//        s3 = new String("JavaRush");
        System.out.println(s1 == s3);
        System.out.println(s2.equals(s3));
    }
}
