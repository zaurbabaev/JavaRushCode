package az.babayev.javarush.javasyntax.lection13;

public class WrapperType3 {
    public static void main(String[] args) {
        double negativeInfinity = Double.NEGATIVE_INFINITY;
        double positiveInfinity = Double.POSITIVE_INFINITY;
        int minExponent = Double.MIN_EXPONENT;
        int maxExponent = Double.MAX_EXPONENT;
        double maxValue = Double.MAX_VALUE;
        double minValue = Double.MIN_VALUE;

        String hexString = Double.toHexString(12.4);
        System.out.println(hexString);

        boolean infinite = Double.isInfinite(1.0 / 0.0);
        System.out.println(infinite);

        boolean naN = Double.isNaN(0.0 / 0.0);
        System.out.println(naN);

        Double valueOf = Double.valueOf(12.4);

        double parseDouble = Double.parseDouble("12.6");
        System.out.println(parseDouble);



    }

}
