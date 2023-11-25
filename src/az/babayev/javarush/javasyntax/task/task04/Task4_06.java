package az.babayev.javarush.javasyntax.task.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье",
если введен номер больше 7 или меньше 1 - вывести "такого дня недели не существует".

Пример для номера 5:
пятница

Пример для номера 10:
такого дня недели не существует
 */
public class Task4_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String day = bufferedReader.readLine();
        int dayI = Integer.parseInt(day);
        String message =
                dayI == 1 ? "понедельник" :
                        dayI == 2 ? "вторник" :
                                dayI == 3 ? "среда" :
                                        dayI == 4 ? "четверг" :
                                                dayI == 5 ? "пятница" :
                                                        dayI == 6 ? "суббота" :
                                                                dayI == 7 ? "воскресенье" :
                                                                        "такого дня недели не существует";
        System.out.println(message);
//        switch (day) {
//            case 1:
//                System.out.println("понедельник");
//                break;
//            case 2:
//                System.out.println("вторник");
//                break;
//            case 3:
//                System.out.println("среда");
//                break;
//            case 4:
//                System.out.println("четверг");
//                break;
//            case 5:
//                System.out.println("пятница");
//                break;
//            case 6:
//                System.out.println("суббота");
//                break;
//            case 7:
//                System.out.println("воскресенье");
//                break;
//            default:
//                System.out.println("такого дня недели не существует");
//        }

    }
}
