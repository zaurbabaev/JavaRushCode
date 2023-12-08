package az.babayev.javarush.javasyntax.lection16;

public class IntegerDemo {
    public static void main(String[] args) {
        Integer a = 10;
        Integer a1 = Integer.valueOf(10);
        System.out.println(a);
        System.out.println(a1);
        System.out.println("-".repeat(20));

        int b = a;
        int b1 = a.intValue();
        System.out.println(b);
        System.out.println(b1);
        System.out.println("-".repeat(20));

        Integer c = a + b;
        Integer c1 = Integer.valueOf(a.intValue() + b);
        System.out.println(c);
        System.out.println(c1);
        System.out.println("-".repeat(20));
        int maxValue = Integer.MAX_VALUE;
        System.out.println("maxValue -> " + maxValue);
        System.out.println("-".repeat(20));
        int minValue = Integer.MIN_VALUE;
        System.out.println("minValue -> " + minValue);
        System.out.println("-".repeat(20));

        String hexString = Integer.toHexString(60);
        System.out.println("hexString -> " + hexString);
        System.out.println("-".repeat(20));

        String binaryString = Integer.toBinaryString(60);
        System.out.println("binaryString -> " + binaryString);
        System.out.println("-".repeat(20));

        String octalString = Integer.toOctalString(60);
        System.out.println("octalString -> " + octalString);
        System.out.println("-".repeat(20));

        Integer i = Integer.valueOf(12);
        int parseInt = Integer.parseInt("300");
        System.out.println("parseInt -> " + parseInt);
        System.out.println("-".repeat(20));
        int valueOfString = Integer.valueOf("300");
        System.out.println("valueOfString -> " + valueOfString);

    }
}
