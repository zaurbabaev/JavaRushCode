package az.babayev.javarush.javasyntax.lection4;

/*
Построим таблицу первых десяти целых, положительных степеней числа
 */
public class WhileExample5 {
    public static void main(String[] args) {
        int number = 3, result = 1, power = 1;
        while (power <= 10) {
            result *= number;
            System.out.println(number + " в степени " + power + " = " + result);
            power++;
        }


//        int number = 3, result = number, power = 1;
//        do {
//            System.out.println(number + " в степени " + power + " = " + result);
//            power++;
//            result *= number;
//        } while (result < 10000);
    }
}
