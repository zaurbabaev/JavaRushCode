package az.babayev.javarush.javasyntax.task.task02;
/*
Реализуй метод print3. Метод должен вывести
переданную строку (слово) на экран три раза через пробел.
 */
public class Task8_05 {
    public static void print3(String text){
        for (int i = 0; i < 3; i++) {
            System.out.println(text+" ");
        }
    }

    public static void main(String[] args) {
        print3("window");
        print3("file");
    }
}
