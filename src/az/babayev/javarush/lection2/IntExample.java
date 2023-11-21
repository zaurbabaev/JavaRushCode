package az.babayev.javarush.lection2;

public class IntExample {
    public static void main(String[] args) {
        int secondsInWeek = 60 * 60 * 24 * 7;
        System.out.println(secondsInWeek);  // 604800

        int a = 9;
        int b = 7;
        int result = (a + b) * (a + b);
        int result2 = a * a + 2 * a * b + b * b;
        System.out.println(result); //256
        System.out.println(result2); //256

        int a1 = Integer.MAX_VALUE + 1;
        System.out.println(a1); //-2147483648

        int value = 123456;
        int result1 = value % 10;
        System.out.println(result1);  // 6

        int result3 = value / 100 % 10;
        System.out.println(result3); //4

        int parseInt = Integer.parseInt("345");
        var i = parseInt + 30;
        System.out.println(i); // 375

        int i1 = 10;
        String value1 = i1 + "";
        String valueOf = String.valueOf(i1);

    }
}
