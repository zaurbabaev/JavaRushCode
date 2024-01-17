package az.babayev.javarush.javasyntax.lection13;

public class WraperTypeEx2 {
    public static void main(String[] args) {

        int maxValue = Integer.MAX_VALUE;
        System.out.println(maxValue);

        int minValue = Integer.MIN_VALUE;
        System.out.println(minValue);

        String hexString = Integer.toHexString(12);
        System.out.println(hexString);

        String octalString = Integer.toOctalString(12);
        System.out.println(octalString);


        String binaryString = Integer.toBinaryString(12);
        System.out.println(binaryString);

        Integer valueOf = Integer.valueOf(12);
        System.out.println(valueOf);

        int parseInt = Integer.parseInt("12");
        System.out.println(parseInt);
    }
}
