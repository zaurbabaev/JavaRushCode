package az.babayev.javarush.javasyntax.repetition;

public class DecimalToBinary {

    public void decimalToBinary(int n) {
        for (int i = 31; i >= 0; i--) {
            int k = n >> i;
            if ((k & 1) > 0) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
        }
    }

    public static void main(String[] args) {
        DecimalToBinary toBinary = new DecimalToBinary();
        int n=39;
        System.out.println("Decimal number: "+n);
        System.out.println("Binary number: ");
        toBinary.decimalToBinary(n);
    }
}
