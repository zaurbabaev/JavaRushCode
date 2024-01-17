package az.babayev.javarush.javasyntax.task.task13;

/*
Метод compare(Character, Character) принимает два символа, выводит
в консоли результат их сравнения.
Реализуй метод compare(Character, Character), который должен правильно сравнивать символы.
Если код первого символа больше второго, вывести "больше".
Если код первого символа меньше второго, вывести "меньше".
Если код первого символа равен второму, вывести "равны".
 */
public class CompareCharacter {
    public static void main(String[] args) {
        compare('a', 'a');
        compare('a', 'б');
        compare('р', 'в');
        compare('ы', 'ы');
    }

    public static void compare(Character first, Character second) {
        int compare = Character.compare(first, second);
        if (first.equals(second)) {
            System.out.println("равны");
        } else if (first > second) {
            System.out.println("больше");
        } else if (first < second) {
            System.out.println("меньше");
        }
    }
}
