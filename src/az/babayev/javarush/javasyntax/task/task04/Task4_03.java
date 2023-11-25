package az.babayev.javarush.javasyntax.task.task04;

/*
Напиши метод checkInterval. Метод должен проверять попало ли целое число в
интервал от 50 до 100 и сообщить результат на экран в следующем виде:
"Число number не содержится в интервале." или "Число number содержится в интервале.",
где number - аргумент метода.

Пример для числа 112:
Число 112 не содержится в интервале.

Пример для числа 60:
Число 60 содержится в интервале.
 */
public class Task4_03 {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }

    public static void checkInterval(int number) {
        if (number >= 50 && number <= 100) {
            System.out.println("Число " + number + " содержится в интервале.");
        } else {
            System.out.println("Число " + number + " не содержится в интервале.");
        }
    }
}
