package az.babayev.javarush.javasyntax.task.task15;

/*
Метод printStackTrace принимает в качестве параметра массив stackTrace.
Нужно вывести информацию о каждом элементе массива в формате:
"Метод <имя метода> вызван из строки <номер строки> класса <имя класса>
в файле <имя файла>."
Информацию о каждом элементе выводи с новой строки.

Пример:
Метод addVodka вызван из строки 30 класса az.babayev.javarush.javasyntax.task.task15.ExceptionEx8 в файле ExceptionEx8.java.
 */
public class ExceptionEx8 {

    public static final String OUTPUT_FORMAT = "Метод %s вызван из строки %d класса %s в файле %s.\n";

    public static void main(String[] args) {
        makeScrewdriver();
    }

    public static void makeScrewdriver() {
        addJuice();
    }

    public static void addJuice() {
        addVodka();
    }

    public static void addVodka() {
        printStackTrace(Thread.currentThread().getStackTrace());
    }

    public static void printStackTrace(StackTraceElement[] stackTrace) {
        for (StackTraceElement info : stackTrace) {
            System.out.printf(OUTPUT_FORMAT, info.getMethodName(), info.getLineNumber(), info.getClassName()
                    , info.getFileName());

        }

    }

}
