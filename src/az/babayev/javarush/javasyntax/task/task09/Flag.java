package az.babayev.javarush.javasyntax.task.task09;

/*
Реализуй методы:

setFlag(int number, int flagPos) — устанавливает значение "1" биту под индексом flagPos числа number
и возвращает новое значение.
resetFlag(int number, int flagPos) — устанавливает значение "0" биту под индексом flagPos числа number
и возвращает новое значение.
checkFlag(int number, int flagPos) — проверяет значение бита под индексом flagPos числа number
 и возвращает true, если значение "1" и false, если "0".
 */
public class Flag {
    public static int setFlag(int number, int flagPos) {

        return number | (1 << flagPos);

    }

    public static int restFlag(int number, int flagPos) {

        return number & ~(1 << flagPos);
    }

    public static boolean checkFlag(int number, int flagPos) {

        return (number & (1 << flagPos)) == (1 << flagPos);
    }

    public static void main(String[] args) {
        int i = setFlag(5, 5);
        String binaryString = Integer.toBinaryString(5);
        System.out.println(binaryString);
        String binaryString2 = Integer.toBinaryString(i);
        System.out.println(binaryString2);
        System.out.println("-".repeat(20));
        int i1 = restFlag(10, 5);
        String binaryString3 = Integer.toBinaryString(10);
        System.out.println(binaryString3);
        String binaryString4 = Integer.toBinaryString(i1);
        System.out.println(binaryString4);

    }
}
