package az.babayev.javarush.javasyntax.task.task10;

/*
Выведи на экран следующий текст в две строки:
It's a Windows path: "C:\Program Files\Java\jdk-13.0.0\bin"
It's a Java string: \"C:\\Program Files\\Java\\jdk-13.0.0\\bin\"

Подсказка:
\” – экранирование двойной кавычки;
\\ – экранирование обратной косой черты (\).

Больше про экранирование символов и Escape-последовательности в
Java читай в статье "Экранирование символов в Java".
 */
public class ExcapeSymbols {
    public static void main(String[] args) {
        String windows = "It's a Windows path: \"C:\\Program Files\\Java\\jdk-13.0.0\\bin\"";
        String javaStr = "It's a Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk-13.0.0\\\\bin\\\"";
        System.out.println(windows);
        System.out.println(javaStr);
    }
}
