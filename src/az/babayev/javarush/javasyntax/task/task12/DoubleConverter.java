package az.babayev.javarush.javasyntax.task.task12;

/*
В методе main конвертируй строку string в тип double с помощью статического
метода parseDouble класса Double.
Затем округли полученное значение, используя статический метод round класса Math.
Результат выведи на экран.
 */
public class DoubleConverter {
    public static void main(String[] args) {
        String string = "12.84";
        int round = (int) (Math.round(Double.parseDouble(string)));
        System.out.println(round);

    }
}
