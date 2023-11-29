package az.babayev.javarush.javasyntax.lection7;

public class ArrayDemo5 {
    public static void main(String[] args) {
        String[] birthdays = new String[10];
        birthdays[0] = "Лена Елисеева, 12 марта";
        birthdays[1] = "Коля Романов, 18 мая";
        birthdays[7] = "Олеся Остапенко, 3 января";

        String olesyaBirthday = birthdays[7];
        System.out.println(olesyaBirthday);

        int length = birthdays.length;
        System.out.println(length);

        for (int i = 0; i < birthdays.length; i++) {
            System.out.println(birthdays[i]);
        }


    }
}
