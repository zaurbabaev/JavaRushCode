package az.babayev.javarush.javasyntax.lection16;

public class DoubleDemo {
    public static void main(String[] args) {
        double negativeInfinity = Double.NEGATIVE_INFINITY;
        System.out.println("negativeInfinity -> " + negativeInfinity);
        System.out.println("-".repeat(20));
        double positiveInfinity = Double.POSITIVE_INFINITY;
        System.out.println("positiveInfinity -> " + positiveInfinity);
        System.out.println("-".repeat(20));
        int minExponent = Double.MIN_EXPONENT;
        System.out.println("minExponent -> " + minExponent);
        System.out.println("-".repeat(20));
        int maxExponent = Double.MAX_EXPONENT;
        System.out.println("maxExponent -> " + maxExponent);
        System.out.println("-".repeat(20));
        double minValue = Double.MIN_VALUE;
        System.out.println("minValue -> " + minValue);
        System.out.println("-".repeat(20));
        double maxValue = Double.MAX_VALUE;
        System.out.println("maxValue -> " + maxValue);
        System.out.println("-".repeat(20));
        String hexString = Double.toHexString(45.4);
        System.out.println("hexString -> " + hexString);
        System.out.println("-".repeat(20));
        boolean infinite = Double.isInfinite(100.0 / 0);
        System.out.println("isInfinite -> " + infinite);
        System.out.println("-".repeat(20));
        boolean naN = Double.isNaN((100.0 / 0) / (100.0 / 0));
        System.out.println("isNaN -> " + naN);
        System.out.println("-".repeat(20));
        Double valueOf = Double.valueOf(40.4);
        System.out.println("valueOf -> " + valueOf);
        System.out.println("-".repeat(20));
        double parseDouble = Double.parseDouble("70.4");
        System.out.println("parseDouble -> " + parseDouble);
        System.out.println("-".repeat(20));


    }
}
