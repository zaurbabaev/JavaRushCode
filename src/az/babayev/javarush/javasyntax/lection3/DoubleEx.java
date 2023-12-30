package az.babayev.javarush.javasyntax.lection3;

public class DoubleEx {
    public static void main(String[] args) {
        double a = 1.000001;
        double b = 1.000002;
        if (Math.abs(b - a) < 0.0001) {
            System.out.println("Числа равны");
        } else {
            System.out.println("Числа не равны");
        }

        int numberA = 2;
        int numberB = 2;
        int max = numberA > numberB ? numberA : numberB;
        System.out.println(max);

//        String result = number < 5 ? "число меньше 5" : number > 5 ?
//                "число больше 5" : "число равно 5";
//        System.out.println(result);

//        if (number > 5) {
//            System.out.println("число больше 5");
//        } else if (number < 5) {
//            System.out.println("число меньше 5");
//        } else {
//            System.out.println("число равно 5");
//        }
    }
}
